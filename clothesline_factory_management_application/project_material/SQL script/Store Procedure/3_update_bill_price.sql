CREATE DEFINER=`root`@`localhost` PROCEDURE `update_bill_price`(IN inst_id INT)
BEGIN
	
	IF(select sum(INSTANCE_TOTAL_PRICE) from INSTANCE where INSTANCE_ID = inst_id ) is NULL then
		
        UPDATE BILLS 
        SET BILL_PRICE = 0.00
        WHERE BILL_ID = (select BILL_ID from INSTANCE where INSTANCE_ID = inst_id);
        
    ELSE 
		
        UPDATE BILLS 
        SET BILL_PRICE = (select sum(INSTANCE_TOTAL_PRICE) from INSTANCE where BILL_ID = (select BILL_ID from INSTANCE where INSTANCE_ID = inst_id))
        WHERE BILL_ID = (select BILL_ID from INSTANCE where INSTANCE_ID = inst_id);
	

	END IF;
END