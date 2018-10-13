CREATE DEFINER=`root`@`localhost` PROCEDURE `update_order_manufacture_cost`(IN omanuId int)
BEGIN
    update order_manufacture
	set omanu_cost = (select sum(mafac_cost) from manufacturing where omanu_id = omanuId) 
	where omanu_id = omanuId;
END