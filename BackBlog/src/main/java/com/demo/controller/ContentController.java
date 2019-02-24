package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manage")
public class ContentController {

	@RequestMapping("queryBlog")
	public String queryBlog()throws Exception {
		
		
		
		return "member-list";
	}
}
