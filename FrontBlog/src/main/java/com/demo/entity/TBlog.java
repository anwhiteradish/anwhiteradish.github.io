package com.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-01-15
 */
public class TBlog implements Serializable{
    /**
     * 博客类型
     */
    private Integer id;

    /**
     * 博客题目
     */
    private String title;

    /**
     * 博客摘要
     */
    private String summary;

    /**
     * 发布日期
     */
    private Date releaseDate;

    /**
     * 评论次数
     */
    private Integer readCount;

    /**
     * 回复次数
     */
    private Integer commentCount;

    /**
     * 博客内容
     */
    private String content;

    /**
     * 关键字
     */
    private String keyWord;

    /**
     * 博客类型，1：原创；2：转载；3：翻译
     */
    private Integer blogType;

    /**
     * 是否显示，1：显示；0：不显示，默认为1
     */
    private Boolean isShow;

    /**
     * 是否可以评论，1：可以；0：不可以，默认为1
     */
    private Boolean isReply;

    /**
     * 是否推荐，1：推荐；0：不推荐，默认为0
     */
    private Boolean isCommend;

    /**
     * 外键关联博客类别
     */
    private Integer type_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getReadCount() {
		return readCount;
	}

	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Integer getBlogType() {
		return blogType;
	}

	public void setBlogType(Integer blogType) {
		this.blogType = blogType;
	}

	public Boolean getIsShow() {
		return isShow;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

	public Boolean getIsReply() {
		return isReply;
	}

	public void setIsReply(Boolean isReply) {
		this.isReply = isReply;
	}

	public Boolean getIsCommend() {
		return isCommend;
	}

	public void setIsCommend(Boolean isCommend) {
		this.isCommend = isCommend;
	}

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

    
}