CREATE DEFINER=`root`@`localhost` PROCEDURE `update_deli_task_amount`(IN dtaskId int)
BEGIN
	if (select sum(TD_AMOUNT) from task_detail where DTASK_ID = dtaskId) is null then
		UPDATE deli_task
		SET DTASK_AMOUNT = 0
		where DTASK_ID = dtaskId;
    else
		UPDATE deli_task
		SET DTASK_AMOUNT = (select sum(TD_AMOUNT) from task_detail where DTASK_ID = dtaskId)
		where DTASK_ID = dtaskId;
    end if;
END