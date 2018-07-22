package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/get")
	public String sayWelcome(){
		
		return "login";
		
	}
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public String checkLogin(@RequestParam("uname")String un ,@RequestParam("pwd")String pwd){
		
		if(un.equals("ashish") && pwd.equals("12345")){
			
			return "success";
		}
		else{
			
	        return "failure";
		}
	
	}
	
}
