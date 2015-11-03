package com.ttrh.repairs.service;

import com.ttrh.repairs.entity.Repairs;

public interface IRepairsService {
	
	/*
	 * 增加报修单
	 */
	int insertReparis(Repairs repairs);
	/*
	 * 修改报修单
	 */
	int updateReparis(Repairs repairs);
	/*
	 * 根据用户查询保修单
	 */
	String selectRepairsByUid(String uid);
}
