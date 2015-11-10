package com.ttrh.repairs.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ttrh.repairs.service.IUserService;
import com.ttrh.repairs.utils.ApplicationContextUtil;

@Controller
@RequestMapping(value = "/")
public class LoginAction extends BaseAction<LoginAction> {
	@Resource
	private IUserService userService = ApplicationContextUtil
			.getBean("userServiceImpl");

	@RequestMapping(value = "login.do")
	public ModelAndView LoginMV(Model model) {
		ModelAndView mv = new ModelAndView();
		return mv;
	}
	
	
	@RequestMapping(value = "userLogin.do")
	public String UserLogin(String uName,String uPwd) {
		String userData=userService.userLogin(uName, uPwd);
		return ajaxJsonSuccessMessage(userData);
	}
	
	
}
