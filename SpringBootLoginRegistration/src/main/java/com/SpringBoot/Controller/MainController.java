package com.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/w")
	public String welcome() {
		System.out.println("welcome");
		return "welcomepage";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("login");
		return "login";
	}
	
	@RequestMapping("/registration")
	public String registration() {
		System.out.println("registration");
			return "registration";
	}
}
