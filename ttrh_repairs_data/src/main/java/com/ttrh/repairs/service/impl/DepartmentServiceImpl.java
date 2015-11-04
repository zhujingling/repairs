package com.ttrh.repairs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ttrh.repairs.dao.DepartmentDao;
import com.ttrh.repairs.entity.Department;
import com.ttrh.repairs.service.IDepartmentService;
import com.ttrh.repairs.utils.IdUtil;

public class DepartmentServiceImpl implements IDepartmentService{

	@Autowired
	private DepartmentDao departmentDao;
	@Override
	public int insertDepartment(Department department) {
		// TODO Auto-generated method stub
		department.setDepartmentId(IdUtil.Uuid());
		return departmentDao.insertDepartment(department);
	}

	@Override
	public int updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentDao.updateDepartment(department);
	}

	@Override
	public String getAllDepartment() {
		// TODO Auto-generated method stub
		String ret=null;
		List<Department> list=departmentDao.getAllDepartment();
		for (Department department : list) {
			ret=department.getDepartmentName();
		}
		return ret;
	}

}
