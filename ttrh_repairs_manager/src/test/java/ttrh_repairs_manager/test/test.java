package ttrh_repairs_manager.test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.ttrh.repairs.entity.User;
import com.ttrh.repairs.service.IRepairsService;
import com.ttrh.repairs.service.IUserService;


public class test {
	@Resource
	private IRepairsService repairsService=ApplicationContextUtil.getBean("repairsServiceImpl");
	@Resource
	private IUserService userService=ApplicationContextUtil.getBean("userServiceImpl");
	

	@Test
	public void testInsertUser(){
		User user=new User();
		user.setUCreateTime(new Date());
		user.setUDepartment("1");
		user.setUEmail("971319231@qq.com");
		user.setUGroup("1");
		user.setUId("11212");
		user.setUName("zhujingling");
		user.setUPhone("15295953561");
		user.setUPwd("1234456");
		user.setUSex("1");
		
		
		System.out.println(userService.insertUser(user));
	}
	
	@Test
	public void testUpdateUser(){
		User user=new User();
		user.setUCreateTime(new Date());
		user.setUDepartment("1");
		user.setUEmail("971319231@qq.com");
		user.setUGroup("1");
		user.setUId("11212");
		user.setUName("ZJL");
		user.setUPhone("15295953561");
		user.setUPwd("1234456");
		user.setUSex("1");
		
		
		System.out.println(userService.updateUser(user));
	}
	
}
