package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.BlogMapper;
import com.demo.entity.DataTablesParams;
import com.demo.entity.DataTablesReturn;
import com.demo.entity.PageBean;
import com.demo.entity.TBlog;
import com.demo.service.BlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogMapper blogMapper;
	
	public PageBean queryList(PageBean pageBean) {
		List<TBlog> list = blogMapper.queryList(pageBean);
		//System.out.println(list.toString());
		pageBean.setResult(list);
		long queryTotal = blogMapper.queryTotal();
		pageBean.setTotalCount(queryTotal);
		int totalPage=(int)Math.ceil(pageBean.getTotalCount()*1.0/pageBean.getPageSize());
		pageBean.setTotalPage(totalPage);
        return pageBean;
	}

	@Override
	public int createSelectivity(TBlog tblog) {
		
		return blogMapper.createSelectivity(tblog);
	}

	@Override
	public TBlog queryById(Integer id) {
		// TODO Auto-generated method stub
		return blogMapper.queryById(id);
	}

	@Override
	public void updateSelectivity(TBlog blog) {
		blogMapper.updateSelectivity(blog);
		
	}

	

}
