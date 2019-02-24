package com.demo.dao;

import java.util.List;

import com.demo.entity.PageBean;
import com.demo.entity.TBlog;

public interface BlogMapper {

	public List<TBlog> queryList(PageBean pageBean);
	
	public long queryTotal();

	public int createSelectivity(TBlog tblog);

	public TBlog queryById(Integer id);

	public void updateSelectivity(TBlog blog);

	
}
