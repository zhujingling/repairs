package com.ttrh.repairs.dao;

import java.util.List;

import com.ttrh.repairs.entity.Department;

public interface DepartmentDao {

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

	List<Department> getAllDepartment();
}
