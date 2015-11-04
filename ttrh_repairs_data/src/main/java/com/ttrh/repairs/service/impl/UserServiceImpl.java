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
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public boolean checkUName(String uName) {
		// TODO Auto-generated method stub
		User user = userDao.checkUName(uName);
		if (user != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkUPwd(String uName, String uPwd) {
		// TODO Auto-generated method stub
		User user = userDao.checkUPwd(uName, uPwd);
		if (user != null) {
			return true;
		}
		return false;
	}

	@Override
	public String getUserInfo(String uName, String uPwd) {
		// TODO Auto-generated method stub
		User user=userDao.getUserInfo(uName, uPwd);
		return null;
	}

}
