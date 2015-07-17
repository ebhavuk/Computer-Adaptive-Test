package com.xebia.cat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xebia.cat.controller.model.Login;
import com.xebia.cat.controller.model.SignUp;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/json")
public class HomeController {

	@RequestMapping("/login/{username}&{password}")
	public @ResponseBody Login validateUser(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		Login login = new Login(username, password);
		return login;
	}

	@RequestMapping("/signup/{username}&{email}&{password}")
	public @ResponseBody SignUp RegisterUser(@PathVariable("username") String username,
			@PathVariable("email") String email, @PathVariable("password") String password) {
		SignUp sign = new SignUp(username,email,password);
		return sign;
	}
}
