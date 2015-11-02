package com.ttrh.repairs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttrh.repairs.dao.RepairsDao;
import com.ttrh.repairs.entity.Repairs;
import com.ttrh.repairs.service.IRepairsService;

@Service("repairsServiceImpl")
public class RepairsServiceImpl implements IRepairsService {

	@Autowired
	public RepairsDao repairsDao;
	public String selectRepairsByUid(String uid) {
		// TODO Auto-generated method stub
		String ret = null;
		List<Repairs> list=repairsDao.selectRepairsByUid(uid);
		for (Repairs repairs : list) {
			ret=repairs.getReparisId();
		}
		return ret;
	}
	@Override
	public String selectRepairs(String uid) {
		// TODO Auto-generated method stub
		String ret = null;
		List<Repairs> list=repairsDao.selectRepairs(uid);
		for (Repairs repairs : list) {
			ret=repairs.getUser().getUCreateTime().toString();
		}
		return ret;
	}

}
