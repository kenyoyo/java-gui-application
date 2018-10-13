CREATE DEFINER=`root`@`localhost` PROCEDURE `update_manufacturing_cost`(IN mafacId int)
BEGIN	
		declare returnCost int default 0;
        if (select sum(MR_COST) from return_material where MAFAC_ID = mafacId) is not null then
			set returnCost =  (select sum(MR_COST) from return_material where MAFAC_ID = mafacId);
		end if;
        
        update manufacturing
        set MAFAC_COST = ((select sum(BR_COST) from bring_material where MAFAC_ID = mafacId) - returnCost)
		where MAFAC_ID = mafacId;
END