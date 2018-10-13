CREATE DEFINER=`root`@`localhost` PROCEDURE `update_product_order_down_payment`(IN pord_id INT)
BEGIN
	
		if(select sum(INSTANCE_TOTAL_PRICE)/2 from INSTANCE where PORDER_ID = pord_id) is not null then	
			if(select porder_id from product_order where PORDER_BILL_TYPE = 1 and PORDER_ID = pord_id) then
			
				UPDATE PRODUCT_ORDER
				SET PORDER_DOWN_PAYMENT = (select sum(INSTANCE_TOTAL_PRICE)/2 from INSTANCE where PORDER_ID = pord_id)
				WHERE PORDER_ID = pord_id;
            
            END IF;
            
        else
				UPDATE PRODUCT_ORDER
				SET PORDER_DOWN_PAYMENT = 0.00
				WHERE PORDER_ID = pord_id;
        
        
		
        END IF;

END