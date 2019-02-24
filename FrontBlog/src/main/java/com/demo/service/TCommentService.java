package com.demo.service;

import java.util.List;

import com.demo.entity.TComment;

public interface TCommentService {

	public int createSelectivity(TComment comment);

	public List<TComment> queryCommentList(int blog_id);
}
