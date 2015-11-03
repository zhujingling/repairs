package ttrh_repairs_manager.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.ttrh.repairs.entity.UGroup;
import com.ttrh.repairs.service.IUGroupService;

public class testUgroup {
	@Resource
	private IUGroupService uGroupService=ApplicationContextUtil.getBean("ugroupServiceImpl");
	@Test
	public void testInsertUGroup(){
		UGroup uGroup=new UGroup();
		uGroup.setGroupId("2");
		uGroup.setGroupName("普通用户");
		uGroup.setGroupDescribe("普通用户");		
		
		System.out.println(uGroupService.insertUGroup(uGroup));
	}
	
	@Test
	public void testUpdateUGroup(){
		UGroup uGroup=new UGroup();
		uGroup.setGroupId("2");
		uGroup.setGroupName("普通用户2");
		uGroup.setGroupDescribe("普通用户2");		
		
		System.out.println(uGroupService.updateUGroup(uGroup));
	}
	
	@Test
	public void testGetAllUGroup(){	
		
		System.out.println(uGroupService.getAllUGroup());
	}
}
