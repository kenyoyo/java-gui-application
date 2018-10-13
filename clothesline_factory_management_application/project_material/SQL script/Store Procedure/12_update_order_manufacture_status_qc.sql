CREATE DEFINER=`root`@`localhost` PROCEDURE `update_order_manufacture_status_qc`(IN omanuId int)
BEGIN
	DECLARE thisStatus tinyint(1) DEFAULT 0;
	
    if (select sum(MAFAC_AMOUNT) from manufacturing where OMANU_ID = omanuId) is not null then
		if (select sum(MAFAC_AMOUNT) from manufacturing where OMANU_ID = omanuId) >= 
			(select OMANU_AMOUNT from order_manufacture where OMANU_ID = omanuId) then
				set thisStatus = 1;
		end if;
    end if;
    
	update order_manufacture 
	set OMANU_QC = (select sum(MAFAC_QC) from manufacturing where OMANU_ID = omanuId),
		OMANU_STATUS = thisStatus
	where OMANU_ID = omanuId;
END