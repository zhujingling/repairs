package com.ttrh.repairs.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ttrh_repairs_manager.test.ApplicationContextUtil;

import com.ttrh.repairs.service.IUserService;

@Controller
@RequestMapping(value = "/login")
public class LoginAction extends BaseAction<LoginAction> {
	@Resource
	private IUserService userService = ApplicationContextUtil
			.getBean("userServiceImpl");

	@RequestMapping(value = "login.html")
	public String login(String userName, String pwd) {
		return null;
	}
}
