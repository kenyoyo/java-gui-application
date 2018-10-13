CREATE DEFINER=`root`@`localhost` PROCEDURE `update_mat_amount`(IN matId int, IN amount int)
BEGIN
	update material
    set mat_amount = mat_amount + amount
    where mat_id = matId;
END