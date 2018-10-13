CREATE DEFINER=`root`@`localhost` PROCEDURE `get_prodId_to_reduce`(IN instanceId int)
BEGIN
	if (select instance_total_amount from INSTANCE where instance_id = instanceId) = (select sum(TD_AMOUNT) from task_detail where instance_id = instanceId) then
		select distinct PROD_ID, INDE_AMOUNT from instance natural join instance_detail where INSTANCE_ID = instanceId;
	end if;
END