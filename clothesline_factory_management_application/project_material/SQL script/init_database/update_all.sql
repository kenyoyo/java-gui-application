CREATE DEFINER=`root`@`localhost` PROCEDURE `update_all`()
BEGIN
	declare var int;
    set var = 1;
    while var <= 768 do
		update bring_material
        set BR_COST = (select sum(BMD_AMOUNT*BMD_UNIT_COST) from bring_mat_detail where BR_ID = var)
        where BR_ID = var;
        
        update return_material
        set MR_COST = (select sum(RMD_AMOUNT*RMD_UNIT_COST) from return_mat_detail where MR_ID = var)
		where MR_ID = var;
    
		if var <= 23 then
			update delivery natural join deli_task natural join instance
			set DELI_DATE = (select distinct instance_deli_date from instance natural join task_detail where DTASK_ID = var)
			where DELI_ID = var;
		end if;
        
        if var <= 45 then
			UPDATE instance
			SET INSTANCE_TOTAL_AMOUNT = (select sum(INDE_AMOUNT) from instance_detail where INSTANCE_ID = var)
			where INSTANCE_ID = var;
			
            update task_detail
            set TD_AMOUNT = (select INSTANCE_TOTAL_AMOUNT from instance where INSTANCE_ID = var)
            where INSTANCE_ID = var;
            
			UPDATE instance
			SET INSTANCE_TOTAL_PRICE = (select sum(INDE_UNITS_PRICE * INDE_AMOUNT) from instance_detail where INSTANCE_ID = var)
			where INSTANCE_ID = var;
		end if;
	set var = var + 1;
    end while;
    
    set var = 1;
    while var <= 144 do
		update manufacturing
        set MAFAC_COST = ((select sum(BR_COST) from bring_material where MAFAC_ID = var) - (select sum(MR_COST) from return_material where MAFAC_ID = var))
		where MAFAC_ID = var;
    
    set var = var + 1;
    end while;
    
    set var = 1;
    while var <= 48 do
    
		if var <= 48 then
            update order_manufacture 
			set OMANU_COST = (select sum(MAFAC_COST) from manufacturing where OMANU_ID = var),
            OMANU_QC = (select sum(MAFAC_QC) from manufacturing where OMANU_ID = var)
			where OMANU_ID = var;
        end if;

        if var <= 23 then
			update DELI_TASK
            SET DTASK_AMOUNT = (select sum(TD_AMOUNT) from task_detail where DTASK_ID = var)
            where DTASK_ID = var;
        end if;
        
        if var <= 38 then
			UPDATE bills
			SET BILL_PRICE = (select sum(INSTANCE_TOTAL_PRICE) from instance where BILL_ID = var)
			where BILL_ID = var;
        end if;
        
        if var <= 6 then
			update material_order
			set MOR_COST = (select sum(MOD_AMOUNT*MOD_UNIT_COST) from mat_order_detail where MOR_ID = var)
			where MOR_ID = var;
		end if;
        
			if var <= 5 then
			
				if(select c_id from claim natural join claim_detail where C_REPAIR = 2 and c_id = var and ct_id = 1) is not null then
					
					UPDATE CLAIM 
					SET C_COST =  (select (select PROD_SALE_PRICE from product natural join claim_detail where C_ID = var) * (CD_AMOUNT - CD_REPAIR) from claim_detail where c_id = var) 
					WHERE C_ID = var;
					
				
				else 
					UPDATE CLAIM 
					SET C_COST = 0.00
					WHERE C_ID = var;
                
			
				end if;
			end if;
            
				if var <= 24 then
			
				
					if(select sum(INSTANCE_TOTAL_PRICE)/2 from INSTANCE natural join PRODUCT_ORDER where  PORDER_BILL_TYPE = 1 and PORDER_ID = var)  is not null then 
						UPDATE PRODUCT_ORDER
						SET PORDER_DOWN_PAYMENT = (select sum(INSTANCE_TOTAL_PRICE)/2 from INSTANCE  where  PORDER_BILL_TYPE = 1 and PORDER_ID = var) 
						WHERE PORDER_ID = var;
						
					else if(select sum(INSTANCE_TOTAL_PRICE)/2 from INSTANCE natural join PRODUCT_ORDER where  PORDER_BILL_TYPE = 1 and PORDER_ID = var) is null then 
						UPDATE PRODUCT_ORDER
						SET PORDER_DOWN_PAYMENT = 0.00
						WHERE PORDER_ID = var;
					
					end if;
		
					end if;
            
				end if;
        
        if var <= 11 then
			update material
			set MAT_UNIT_COST = (select sum(MOD_AMOUNT*MOD_UNIT_COST) / sum(MOD_AMOUNT) from produce natural join mat_order_detail  where mat_id = var)
			where mat_id = var;
        end if;
        
    set var = var + 1;    
    end while;
    
    set var = 1;
    while var <= 23 do
    
        if var <= 23 then
			update delivery
            SET DELI_AMOUNT = (select sum(DTASK_AMOUNT) from DELI_TASK where DELI_ID = var)
            where DELI_ID = var;
        end if;
        
        if var <= 16 then
			update product
			set PROD_AMOUNT = (select sum(OMANU_AMOUNT - OMANU_QC) from order_manufacture where PROD_ID = var)
            where PROD_ID = var;
            
            update product
			set PROD_AMOUNT = PROD_AMOUNT - (select sum(INDE_AMOUNT) from instance_detail where PROD_ID = var)
            where PROD_ID = var;
            
            update product
            set PROD_CAPITAL_COST = (select sum(OMANU_COST) / sum(OMANU_AMOUNT) from order_manufacture where PROD_ID = var) 
            where PROD_ID = var;
        end if;
        
        set var = var+1;
	end while;
END