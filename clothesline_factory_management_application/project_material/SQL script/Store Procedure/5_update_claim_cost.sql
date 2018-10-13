CREATE DEFINER=`root`@`localhost` PROCEDURE `update_claim_cost`(in claim_id INT, in product_name VARCHAR(300))
BEGIN
		
		
		if (select sum(CD_UNIT_COST)  from  claim_detail natural join claim where C_ID = claim_id  and C_REPAIR = 2 and CT_ID = 1 )is null then
				UPDATE CLAIM 
                SET C_COST = 0.00
                WHERE C_ID = claim_id;
			
              
		else if  (select sum(CD_UNIT_COST)  from  claim_detail natural join claim where C_ID = claim_id  and C_REPAIR = 2 and CT_ID = 1 )is not null then
        
            if (select sum(CD_UNIT_COST)  from product natural join claim_detail natural join claim where C_ID = claim_id   and C_REPAIR = 2 and CT_ID = 1 ) is not null then		
					
                    UPDATE CLAIM 
					SET C_COST =  (select sum(CD_UNIT_COST)  from  claim_detail  where  C_REPAIR = 2 and CT_ID = 1 ) 
                    WHERE C_ID = claim_id;
					
			
			if (select sum(CD_UNIT_COST)  from product natural join claim_detail natural join claim where C_ID = claim_id  and C_REPAIR = 2 and CT_ID = 1 ) is null then		
					
                    UPDATE CLAIM 
					SET C_COST = (select sum( CD_UNIT_COST)  from  claim_detail  where C_REPAIR = 2 and CT_ID = 1 )
                    WHERE C_ID = claim_id;
					
			
			if (select sum( PROD_SALE_PRICE * (CD_AMOUNT-CD_REPAIR ))  from product natural join claim_detail natural join claim where C_ID = claim_id  and C_REPAIR = 2 and CT_ID = 2 )  is not null then
					
                    UPDATE CLAIM 
					SET C_COST = 0.00
					WHERE C_ID = claim_id;
					
			if (select sum( PROD_SALE_PRICE * (CD_AMOUNT-CD_REPAIR ))  from product natural join claim_detail natural join claim where C_ID = claim_id  and C_REPAIR = 2 and CT_ID = 2 )  is null then
					
                    UPDATE CLAIM 
					SET C_COST = 0.00
					WHERE C_ID = claim_id;
                    
                    
                    
		
					
						end if;
                    end if;
				end if;
			end if;
        end if; 
    end if; 
END