package com.ttrh.repairs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ttrh.repairs.entity.Repairs;

@Repository
public interface RepairsDao {
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
	List<Repairs> selectRepairsByUid(@Param("UId")String uid);
}
