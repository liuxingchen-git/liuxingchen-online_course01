package com.liuxingchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloMaven {
	
	@RequestMapping("list")
	public String HelloList() {
		return "list";
	}

}
