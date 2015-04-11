package com.pradip.spring.social.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pradip
 *
 */
@Controller
public class LoginController {

	@RequestMapping(value={"/","/login"})
	public String welcome()
	{
		System.out.println("Login Controller called");
		return "login";
	}
	
}
