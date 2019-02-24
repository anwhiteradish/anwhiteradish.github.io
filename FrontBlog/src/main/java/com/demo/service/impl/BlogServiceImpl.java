package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.TBlogMapper;
import com.demo.entity.PageBean;
import com.demo.entity.TBlog;
import com.demo.service.BlogService;


@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private TBlogMapper blogMapper;
	
	
	public PageBean queryList(PageBean pageBean) {
		
		List<TBlog> list = blogMapper.queryList(pageBean);
		pageBean.setResult(list);
		int queryTotal = blogMapper.queryTotal();
		pageBean.setTotalCount(queryTotal);
		int totalPage=(int)Math.ceil(pageBean.getTotalCount()*1.0/pageBean.getPageSize());
		pageBean.setTotalPage(totalPage);
        return pageBean;
	}
	@Override
	public TBlog queryOneBlog(int id) {
		TBlog blog=blogMapper.queryOneBlog(id);
		return blog;
	}
	@Override
	public List<TBlog> search(String keywords) {
		return blogMapper.search(keywords);
	}
	@Override
	public int searchCount(String data) {
		return blogMapper.searchCount(data);
	}

}
