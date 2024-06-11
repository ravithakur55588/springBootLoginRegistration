package com.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBoot.Service.UserService;
import com.SpringBoot.User.User;

@Controller
public class RegistrationController {

	@Autowired
	private UserService us;

	@RequestMapping("/reg")
	public String regis(@RequestParam String name, @RequestParam String email, @RequestParam String pw) {

		User u = new User();
		u.setUname(name);
		u.setUemail(email);
		u.setUpassword(pw);

		System.out.println(u);

		us.insert(u);
		
		return "success";
	}
	
	

}
