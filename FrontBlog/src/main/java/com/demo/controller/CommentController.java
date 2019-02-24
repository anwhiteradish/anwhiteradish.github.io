package com.demo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.TBlog;
import com.demo.entity.TComment;
import com.demo.exception.BlogException;
import com.demo.service.BlogService;
import com.demo.service.TCommentService;

@Controller
public class CommentController {

	@Autowired
	private TCommentService commentService;
	
	
	@RequestMapping("/comment")
	@ResponseBody
	public void comment(@RequestParam(value="id",defaultValue="1")int id,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String blog_id = request.getParameter("blog_id");
		String userName = request.getParameter("userName");
		String content = request.getParameter("content");
		String email = request.getParameter("email");
		TComment comment =new TComment();
		comment.setBlog_id(Integer.parseInt(blog_id));
		if(userName==null || "".equals(userName)) {
			throw new BlogException("用户名不能为空");
		}
		if(content==null || "".equals(content)) {
			throw new BlogException("用户名不能为空");
		}
		if(email==null || "".equals(email)) {
			throw new BlogException("用户名不能为空");
		}
		comment.setUserName(userName);
		comment.setContent(content);
		comment.setState(1);
		comment.setUserIp(getIpAddr(request));
		comment.setEmail(email);
		int createSelectivity = commentService.createSelectivity(comment);
		if(createSelectivity>0) {
			try {
				response.getWriter().write("评论成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	/*@RequestMapping("/comment")
	public String comment(TComment comment,Model model,@RequestParam(value="id",defaultValue="1")int id,HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		TBlog blog=blogService.queryOneBlog(id);
		model.addAttribute("blog", blog);
		
		TComment comment=new TComment();
		String blog_id = request.getParameter("blog_id");
		String userName = request.getParameter("userName");
		String content = request.getParameter("content");
		comment.setBlog_id(Integer.parseInt(blog_id));
		comment.setContent(content);
		comment.setUserName(userName);
		comment.setState(1);
		comment.setUserIp(getIpAddr(request));
		System.out.println(comment);
		int id1 = commentService.createSelectivity(comment);
		
		if (id1 > 0) {
			List<TComment> queryCommentList = commentService.queryCommentList(id);
			model.addAttribute("commentList", queryCommentList);
			
			try {
				response.getWriter().write("评论成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "detail";
		}

		return null;
	}*/

	/**
	 * 获取登录用户IP地址
	 * 
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip.equals("0:0:0:0:0:0:0:1")) {
			ip = "本地";
		}
		return ip;
	}
}
