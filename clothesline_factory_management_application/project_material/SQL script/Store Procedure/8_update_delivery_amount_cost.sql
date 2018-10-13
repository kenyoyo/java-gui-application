CREATE DEFINER=`root`@`localhost` PROCEDURE `update_delivery_amount_cost`(IN deliId int)
BEGIN
	if not ((select sum(DTASK_AMOUNT) from deli_task where DELI_ID = deliId) is null) then
		UPDATE delivery
		SET DELI_AMOUNT = (select sum(DTASK_AMOUNT) from deli_task where DELI_ID = deliId)
		where DELI_ID = deliId;
	else
		UPDATE delivery
		SET DELI_AMOUNT = 0
		where DELI_ID = deliId;
    
    end if;
        
    if not ((select sum(DTASK_COST) from deli_task where DELI_ID = deliId) is null) then    
        UPDATE delivery
		SET DELI_COST = (select sum(DTASK_COST) from deli_task where DELI_ID = deliId)
		where DELI_ID = deliId;
	else
		UPDATE delivery
		SET DELI_COST = 0
		where DELI_ID = deliId;
	end if;	
END