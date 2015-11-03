package com.ttrh.repairs.dao;

import java.util.List;

import com.ttrh.repairs.entity.User;

public interface UserDao {
	/*
	 * 增加用户
	 */
	int insertUser(User user);
	/*
	 * 修改用户
	 */
	int updateUser(User user);
	/*
	 * 校验用户
	 */
	User checkUName(String uName);
	/*
	 * 检验密码
	 */
	
	User checkUName(String uName,String uPwd);
	
	/*
	 * 得到用户信息
	 */
	User getUserInfo(String uName,String uPwd);
}
