package ttrh_repairs_manager.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.ttrh.repairs.service.IRepairsService;
import com.ttrh.repairs.service.IUserService;


public class test {
	@Resource
	private IRepairsService repairsService=ApplicationContextUtil.getBean("repairsServiceImpl");
	@Resource
	private IUserService userService=ApplicationContextUtil.getBean("userServiceImpl");
	@Test
	public void testRepairs(){
		System.out.println(repairsService.selectRepairs("1"));
	}

	@Test
	public void testUser(){
		System.out.println(userService.getAllUser());
	}
	
	@Test
	public void testUserRepairs(){
		System.out.println(userService.getRepairsByUser());
	}
}
