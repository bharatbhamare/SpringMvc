package com.test.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {

	@GetMapping("/index")
	public String indexPage()
	{
		return "index";
	}
}
