package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResourceController {

	@RequestMapping("/resource")
	public String resource() {
		return "resource";
	}
}
