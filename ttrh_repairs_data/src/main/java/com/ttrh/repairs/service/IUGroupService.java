package com.ttrh.repairs.service;

import com.ttrh.repairs.entity.UGroup;

public interface IUGroupService {
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
	String getAllUGroup();
}
