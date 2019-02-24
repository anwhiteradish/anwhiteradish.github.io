package com.demo.service;

import java.util.List;

import com.demo.entity.PageBean;
import com.demo.entity.TBlog;

public interface BlogService {

	public PageBean queryList(PageBean pageBean);

	public TBlog queryOneBlog(int id);
	
	public List<TBlog> search(String keywords);
	
	public int searchCount(String data);
}
