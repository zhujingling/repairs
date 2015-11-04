package ttrh_repairs_manager.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.ttrh.repairs.service.IUserService;
import com.ttrh.repairs.utils.Md5Util;

public class testUser {
	@Resource
	private IUserService userService=ApplicationContextUtil.getBean("userServiceImpl");
	
	@Test
	public void testGetUserInfo() {
		System.out.println(userService.getUserInfo("1", "1"));
	}
	
	@Test
	public void testUserLogin() {
		
		System.out.println(userService.userLogin("zhujingling", Md5Util.GetMD5Code("1234456")));
	}
}
