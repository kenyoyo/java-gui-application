CREATE DEFINER=`root`@`localhost` PROCEDURE `update_inde_amount`(IN inst_id INT)
BEGIN
	IF(select sum(INDE_AMOUNT) from instance_detail where INSTANCE_ID = inst_id) is null  THEN
		
        UPDATE INSTANCE
		SET INSTANCE_TOTAL_AMOUNT = 0
		WHERE INSTANCE_ID = inst_id;
		
		UPDATE INSTANCE
		SET INSTANCE_TOTAL_PRICE = 0
		WHERE INSTANCE_ID = inst_id;
    
        
    
    ELSE 
		
        UPDATE INSTANCE
		SET INSTANCE_TOTAL_AMOUNT = (select sum(INDE_AMOUNT) from instance_detail where INSTANCE_ID = inst_id)
		WHERE INSTANCE_ID = inst_id;
		
		UPDATE INSTANCE
		SET INSTANCE_TOTAL_PRICE = (select sum(INDE_UNITS_PRICE * INDE_AMOUNT) from instance_detail where INSTANCE_ID = inst_id)
		WHERE INSTANCE_ID = inst_id;
    
        
        
        
    END IF;
  

 END