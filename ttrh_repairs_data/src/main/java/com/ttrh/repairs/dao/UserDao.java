package com.ttrh.repairs.dao;

import org.apache.ibatis.annotations.Param;

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
	User checkUName(@Param("uName")String uName);
	/*
	 * 检验密码
	 */
	
	User checkUPwd(@Param("uName")String uName,@Param("uPwd")String uPwd);
	
	/*
	 * 得到用户信息
	 */
	User getUserInfo(@Param("uName")String uName,@Param("uPwd")String uPwd);
}
