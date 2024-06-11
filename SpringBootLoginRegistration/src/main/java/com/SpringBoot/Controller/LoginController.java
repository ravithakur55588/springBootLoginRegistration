package com.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBoot.Service.UserService;
import com.SpringBoot.User.User;

@Controller
public class LoginController {

	@Autowired
	private UserService us;
	
	@RequestMapping("/log")
	public String login_success(@RequestParam String email,@RequestParam String password) {
		
		 List<User> u =	us.getuserbyemail(email);
		 
		for (User user : u) {
			String pw = user.getUpassword();
			
			if( pw.equals(password)) {
				System.out.println("password match");
				return "login_success";
				
			}else
			{
				System.out.println("password not matched");
				return "login";
			}
		}
		return "registration";
		
	}
	
}
