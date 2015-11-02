package com.ttrh.repairs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttrh.repairs.dao.UserDao;
import com.ttrh.repairs.entity.Repairs;
import com.ttrh.repairs.entity.User;
import com.ttrh.repairs.service.IUserService;
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {

	@Autowired
	public UserDao userDao;
	@Override
	public String getAllUser() {
		// TODO Auto-generated method stub
		String ret=null;
		List<User> list=userDao.getAllUser();
		for (User user : list) {
			ret=user.getUName();
		}
		return ret;
	}
	@Override
	public String getRepairsByUser() {
		// TODO Auto-generated method stub
		String ret=null;
		List<User> list=userDao.getRepairsByUser();
		for (User user : list) {
			List<Repairs> listRepairs=user.getRepairs();
			for (Repairs repairs : listRepairs) {
				ret=user.getUCreateTime()+","+repairs.getReparisNumber();
			}
		}
		return ret;
	}

}
