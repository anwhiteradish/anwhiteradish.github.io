package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.TCommentMapper;
import com.demo.entity.TComment;
import com.demo.service.TCommentService;
@Service
public class TCommentServiceImpl implements TCommentService {

	@Autowired
	private TCommentMapper commentMapper;
	@Override
	public int createSelectivity(TComment comment) {
		int createSelectivity = commentMapper.createSelectivity(comment);
		return createSelectivity;

	}
	@Override
	public List<TComment> queryCommentList(int blog_id) {
		
		return commentMapper.queryCommentList(blog_id);
	}

}
