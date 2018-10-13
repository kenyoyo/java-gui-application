CREATE DEFINER=`root`@`localhost` PROCEDURE `update_bring_mat_cost`(IN brId int)
BEGIN
	if (select sum(BMD_AMOUNT*BMD_UNIT_COST) from bring_mat_detail where BR_ID = brId) is not null then
		update bring_material
		set BR_COST = (select sum(BMD_AMOUNT*BMD_UNIT_COST) from bring_mat_detail where BR_ID = brId)
		where BR_ID = brId;
    else
		update bring_material
		set BR_COST = 0
		where BR_ID = brId;
	end if;
END