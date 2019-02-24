package com.demo.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.PageBean;
import com.demo.entity.TBlog;
import com.demo.service.BlogService;

@Controller
public class ArticleController {

	@Autowired
	private BlogService blogService;
	
	@RequestMapping("/article")
	public String article(@RequestParam(value="currentPage", required=false,defaultValue = "1")  int currentPage,PageBean pageBean, Model model) {
		pageBean.setCurrentPage(currentPage);
		PageBean queryList = blogService.queryList(pageBean);
		model.addAttribute("page", queryList);	
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("totalPage", queryList.getTotalPage());
		
		return "article";
	}
	
	@RequestMapping("/search")//@Param(value="keywords")
	public String search(String keywords,Model model) {
		System.out.println(keywords);
		List<TBlog> search = blogService.search(keywords);
		int searchCount = blogService.searchCount(keywords);
		model.addAttribute("searchList", search);
		model.addAttribute("keywords", keywords);
		model.addAttribute("searchCount", searchCount);
		return "article";
	}
}
