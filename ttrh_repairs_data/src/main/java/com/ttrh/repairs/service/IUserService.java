package com.ttrh.repairs.service;

import com.ttrh.repairs.entity.User;

public interface IUserService {

	int insertUser(User user);

	int updateUser(User user);

	/*
	 * 校验用户
	 */
	boolean checkUName(String uName);

	/*
	 * 检验密码
	 */

	boolean checkUName(String uName, String uPwd);

	/*
	 * 得到用户信息
	 */
	String getUserInfo(String uName, String uPwd);

}
