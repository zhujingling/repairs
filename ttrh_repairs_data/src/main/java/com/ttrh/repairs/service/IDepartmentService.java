package com.ttrh.repairs.service;

import com.ttrh.repairs.entity.Department;

public interface IDepartmentService {
	/*
	 * 增加部门
	 */
	int insertDepartment(Department department);

	/*
	 * 修改部门
	 */
	int updateDepartment(Department department);

	/*
	 * 得到所有部门
	 */

	String getAllDepartment();
}
