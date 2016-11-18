package com.ctrip.xpipe.redis.console.service;

import java.util.List;

import com.ctrip.xpipe.redis.console.model.DcTbl;

public interface DcService {
	DcTbl find(String dcName);
	DcTbl find(long dcId);
	List<DcTbl> findAllDcs();
	List<DcTbl> findAllDcNames();
	List<DcTbl> findAllDcBasic();
	List<DcTbl> findClusterRelatedDc(String clusterName);
	List<DcTbl> findAllDetails(String dcName);
	List<DcTbl> findAllActiveKeepers();
	DcTbl findByDcName(String activeDcName);
	
}
