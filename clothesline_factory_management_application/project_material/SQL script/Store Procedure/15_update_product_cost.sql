CREATE DEFINER=`root`@`localhost` PROCEDURE `update_product_cost`(IN omanuId int)
BEGIN
    update product natural join order_manufacture
	set PROD_CAPITAL_COST = (PROD_CAPITAL_COST * PROD_AMOUNT + (select sum(mafac_cost) from manufacturing where omanu_id = omanuId)) 
							/ (PROD_AMOUNT + (select sum(mafac_amount) from manufacturing where omanu_id = omanuId)) 
	where omanu_id = omanuId;
END