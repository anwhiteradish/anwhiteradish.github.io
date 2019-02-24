package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.PageBean;
import com.demo.entity.TBlog;
import com.demo.entity.TComment;
import com.demo.service.BlogService;
import com.demo.service.TCommentService;

@Controller
public class IndexController {

	@Autowired
	private BlogService blogService;
	@Autowired
	private TCommentService commentService;
	
	@RequestMapping("/")
	public String home(@RequestParam(value="currentPage", required=false,defaultValue = "1")  int currentPage,PageBean pageBean, Model model) {
		pageBean.setCurrentPage(currentPage);
		PageBean queryList = blogService.queryList(pageBean);
		model.addAttribute("page", queryList);	
		return "home";
	}
	
	
	@RequestMapping("/detail")
	public String detail(Model model,@RequestParam(value="id",defaultValue="1")int id) {
		
		TBlog blog=blogService.queryOneBlog(id);
		
		model.addAttribute("blog", blog);
		List<TComment> queryCommentList = commentService.queryCommentList(id);
		model.addAttribute("commentList", queryCommentList);
		System.out.println(queryCommentList.toString());
		return "detail";
	}
	
	
}
