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
public class TComment  implements Serializable{
    /**
     * 评论表id
     */
    private Integer id;

    /**
     * 评论者的ip
     */
    private String userIp;

    /**
     * 评论名称
     */
    private String userName;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论日期
     */
    private Date commentDate;

    /**
     * 是否通过审核，0：待审核， 1：审核通过， 2：未通过，默认为0
     */
    private Integer state;

    /**
     * 父评论ID
     */
    private String to_id;
    
    private String email;
    

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
     * 外键关联具体博客
     */
    private Integer blog_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTo_id() {
        return to_id;
    }

    public void setTo_id(String to_id) {
        this.to_id = to_id == null ? null : to_id.trim();
    }

    public Integer getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(Integer blog_id) {
        this.blog_id = blog_id;
    }

	@Override
	public String toString() {
		return "TComment [id=" + id + ", userIp=" + userIp + ", userName=" + userName + ", content=" + content
				+ ", commentDate=" + commentDate + ", state=" + state + ", to_id=" + to_id + ", blog_id=" + blog_id
				+ "]";
	}
    
}