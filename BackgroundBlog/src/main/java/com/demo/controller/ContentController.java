package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.PageBean;
import com.demo.entity.SysPermission;
import com.demo.entity.TBlog;
import com.demo.service.BlogService;
import com.demo.service.SysService;

@Controller
@RequestMapping("/manage")
public class ContentController {

	@Autowired
	private SysService sysService;
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping("/queryBlog")
	public String queryBlog(@RequestParam(value="currentPage", required=false,defaultValue = "1")  int currentPage,PageBean pageBean, Model model)throws Exception {
		List<SysPermission> findMenuList = sysService.findMenuList();
		model.addAttribute("categoryList", findMenuList);
		pageBean.setCurrentPage(currentPage);
		PageBean queryList = blogService.queryList(pageBean);
		model.addAttribute("page", queryList);	
		return "article-list";
	}
	
	@RequestMapping("/articleAdd")
	public String articleAdd() {
		return "article-add";
	}
	@RequestMapping("/article")
	public String article(TBlog tblog,@RequestParam(value="currentPage", required=false,defaultValue = "1")  int currentPage,PageBean pageBean,Model model) throws Exception {
		
		/*String title = request.getParameter("title");
		String summary = request.getParameter("summary");
		String releaseDate = request.getParameter("releaseDate");
		String keyWord = request.getParameter("keyWord");
		String blogType = request.getParameter("blogType");
		String content = request.getParameter("content");
		TBlog tblog=new TBlog();
		tblog.setTitle(title);
		tblog.setSummary(summary);
		tblog.setKeyWord(keyWord);
		tblog.setBlogType(Integer.parseInt(blogType));
		tblog.setContent(content);*/
		int result=blogService.createSelectivity(tblog);
		PageBean queryList = blogService.queryList(pageBean);
		model.addAttribute("page", queryList);
		return "article-list";
	}
	@RequestMapping("/queryById")
	public String queryById(Integer id,Model model) {
		TBlog blog=blogService.queryById(id);
		model.addAttribute("blog", blog);
		return "article-update";
	}
	@RequestMapping("/updateSelectivity")
	public String updateSelectivity(TBlog blog) {
		blogService.updateSelectivity(blog);
		
		return "redirect:/manage/queryBlog";
	}
	
}
