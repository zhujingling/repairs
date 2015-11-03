package com.ttrh.repairs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttrh.repairs.dao.UGroupDao;
import com.ttrh.repairs.entity.UGroup;
import com.ttrh.repairs.service.IUGroupService;

@Service("ugroupServiceImpl")
public class UGroupService implements IUGroupService {

	@Autowired
	private UGroupDao ugroupDao;
	@Override
	public int insertUGroup(UGroup uGroup) {
		// TODO Auto-generated method stub
		return ugroupDao.insertUGroup(uGroup);
	}

	@Override
	public int updateUGroup(UGroup uGroup) {
		// TODO Auto-generated method stub
		return ugroupDao.updateUGroup(uGroup);
	}

	@Override
	public String getAllUGroup() {
		// TODO Auto-generated method stub
		String ret=null;
		List<UGroup> list=ugroupDao.getAllUGroup();
		for (UGroup uGroup : list) {
			ret=uGroup.getGroupName();
		}
		return ret;
	}

}
