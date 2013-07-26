package com.shine.ssi.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shine.ssi.core.service.UserManageService;
import com.shine.ssi.model.UserPO;

@Controller
public class IndexController {
	@Autowired
	private UserManageService userManageService;
	
	@RequestMapping("/index")
	public String helloSpring(@RequestParam("id") String id,HttpServletRequest request){
		UserPO user  = userManageService.findById(id);
		request.setAttribute("user", user);
		 return "test";
	}
}
