package com.graykey.ssm.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graykey.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userServiceImp")
	private IUserService userService;
	
	@RequestMapping("/login")
	public String login(){
		
		userService.add();
		
		return "success";
	}
}
