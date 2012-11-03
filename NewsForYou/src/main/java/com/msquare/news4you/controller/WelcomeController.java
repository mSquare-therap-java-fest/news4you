package com.msquare.news4you.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("welcome")
public class WelcomeController {
	@RequestMapping("index")
	public String index() {
		return "welcome";
	}
}
