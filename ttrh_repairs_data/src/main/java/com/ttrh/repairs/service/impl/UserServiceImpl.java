package com.ttrh.repairs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.ttrh.repairs.dao.UserDao;
import com.ttrh.repairs.entity.Repairs;
import com.ttrh.repairs.entity.User;
import com.ttrh.repairs.service.IUserService;
import com.ttrh.repairs.utils.IdUtil;
import com.ttrh.repairs.utils.Md5Util;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {

	@Autowired
	public UserDao userDao;

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		user.setUId(IdUtil.Uuid());
		user.setUPwd(Md5Util.GetMD5Code(user.getUPwd()));
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
		User user = userDao.getUserInfo(uName, uPwd);
		JsonObject jsonUser = new JsonObject();
		if (user != null) {
			jsonUser.addProperty("UName", user.getUName());
			jsonUser.addProperty("USex", user.getUSex());
			jsonUser.addProperty("UDepartment", user.getUDepartment());
			jsonUser.addProperty("UEmail", user.getUEmail());
			jsonUser.addProperty("UPhone", user.getUPhone());
			jsonUser.addProperty("UCreateTime", user.getUCreateTime()
					.toString());
			jsonUser.addProperty("UGroup", user.getUGroup());
		}
		return jsonUser.toString();
	}

	public String userLogin(String uName, String uPwd) {
		JsonObject jsonLogin = new JsonObject();
		if (checkUName(uName)) {
			if (checkUPwd(uName, uPwd)) {
				return getUserInfo(uName, uPwd);
			} else {
				jsonLogin.addProperty("code", "-1");
				jsonLogin.addProperty("message", "密码错误");
			}
		} else {
			jsonLogin.addProperty("code", "0");
			jsonLogin.addProperty("message", "用户名错误");
		}
		return jsonLogin.toString();
	}

}
