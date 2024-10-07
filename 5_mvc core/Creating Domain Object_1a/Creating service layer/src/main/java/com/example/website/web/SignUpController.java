package com.example.website.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.website.service.UserService;

@Controller
public class SignUpController {
	@Autowired
	UserService userService;

	@RequestMapping("/signUp")
	public String getSignUpPage() {
		return "signup";
	}

}
