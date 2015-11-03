package com.ttrh.repairs.dao;

import java.util.List;

import com.ttrh.repairs.entity.UGroup;

public interface UGroupDao {
	/*
	 * 增加用户组
	 */
	int insertUGroup(UGroup uGroup );
	/*
	 * 修改用户组
	 */
	int updateUGroup(UGroup uGroup);
	/*
	 * 查询用户组
	 */
	List<UGroup> getAllUGroup();
}
