CREATE DEFINER=`root`@`localhost` PROCEDURE `update_product_amount`(IN productId int, IN num int)
BEGIN
	update product
    set prod_amount = prod_amount + num
    where prod_id = productId;
END