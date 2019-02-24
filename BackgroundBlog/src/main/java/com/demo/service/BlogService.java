package com.demo.service;

import java.util.List;

import com.demo.entity.DataTablesParams;
import com.demo.entity.DataTablesReturn;
import com.demo.entity.PageBean;
import com.demo.entity.TBlog;

public interface BlogService {

	public PageBean queryList(PageBean pageBean);

	public int createSelectivity(TBlog tblog);

	public TBlog queryById(Integer id);

	public void updateSelectivity(TBlog blog);

	
}
