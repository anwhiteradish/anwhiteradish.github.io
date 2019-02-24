package com.demo.dao;

import java.util.List;

import com.demo.entity.TComment;

public interface TCommentMapper {
    
	public int createSelectivity(TComment comment);
	
	public List<TComment> queryCommentList(int blog_id);
}