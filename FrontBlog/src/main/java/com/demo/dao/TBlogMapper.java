package com.demo.dao;

import java.util.List;

import com.demo.entity.PageBean;
import com.demo.entity.TBlog;

public interface TBlogMapper {
    
	public List<TBlog> queryList(PageBean pageBean);
	
	public int queryTotal();

	public TBlog queryOneBlog(int id);
	
	public List<TBlog> search(String keywords);
	
	public int searchCount(String search);
}