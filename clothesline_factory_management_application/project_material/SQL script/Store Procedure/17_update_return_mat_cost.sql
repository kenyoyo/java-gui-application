CREATE DEFINER=`root`@`localhost` PROCEDURE `update_return_mat_cost`(IN mrId int)
BEGIN
	if (select sum(RMD_AMOUNT*RMD_UNIT_COST) from return_mat_detail where MR_ID = mrId) is not null then
		update return_material
        set MR_COST = (select sum(RMD_AMOUNT*RMD_UNIT_COST) from return_mat_detail where MR_ID = mrId)
		where MR_ID = mrId;
	
    else
		update return_material
        set MR_COST = 0
		where MR_ID = mrId;
    
    end if;
    
END