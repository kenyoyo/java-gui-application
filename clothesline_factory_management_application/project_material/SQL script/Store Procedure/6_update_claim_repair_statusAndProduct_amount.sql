CREATE DEFINER=`root`@`localhost` PROCEDURE `update_claim_repair_statusAndProduct_amount`(IN porder_ID INT, IN claim_ID INT)
BEGIN

	if(select sum(CD_UNIT_COST) from claim_detail natural join claim where c_id = claim_ID and c_repair = 2) is not null then
		
        UPDATE CLAIM
        SET C_COST = (select sum(CD_UNIT_COST) from claim_detail  where c_id = claim_ID and c_repair = 2)
        WHERE C_ID = claim_ID;
        
        UPDATE PRODUCT natural join CLAIM_DETAIL
        SET PROD_AMOUNT = PROD_AMOUNT + CD_REPAIR
        WHERE C_ID = claim_id;
        
        
        
    else if(select sum(CD_UNIT_COST) from claim_detail natural join claim where c_id = claim_ID and c_repair = 2) is null then
		UPDATE CLAIM
        SET C_COST = 0.0
        WHERE C_ID = claim_ID;
    
    
    if(select sum(CD_UNIT_COST) from claim_detail natural join claim where c_id = claim_ID and c_repair = 1) is not null then
		
		UPDATE CLAIM
        SET C_COST = 0.0
        WHERE C_ID = claim_ID;
        
        UPDATE PRODUCT natural join CLAIM_DETAIL
        SET PROD_AMOUNT = PROD_AMOUNT - CD_REPAIR
        WHERE C_ID = claim_id;
        
	else if(select sum(CD_UNIT_COST) from claim_detail natural join claim where c_id = claim_ID and c_repair = 1) is null then
		UPDATE CLAIM
        SET C_COST = 0.0
        WHERE C_ID = claim_ID;
    
    
				end if;
            end if;
		end if;
	end if;
END