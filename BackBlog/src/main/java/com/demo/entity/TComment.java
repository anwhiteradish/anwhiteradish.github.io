/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author: bianj
 * Email: edinsker@163.com
 * Version: 5.9.2
 */
package com.demo.entity;

import java.sql.Timestamp;

/**
 * T_COMMENT
 * 
 * @author chen
 * @version 1.0.0 2019-01-31
 */
public class TComment implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2873027862315905060L;

    /** 评论表id */
    private Integer id;

    /** 评论者的ip */
    private String userIp;

    /** 评论名称 */
    private String userName;

    /** 评论内容 */
    private String content;

    /** 评论日期 */
    private Timestamp commentDate;

    /** 是否通过审核，0：待审核， 1：审核通过， 2：未通过，默认为0 */
    private Integer state;

    /** 父评论ID */
    private String toId;

    /** 外键关联具体博客 */
    private Integer blogId;

    /**
     * 获取评论表id
     * 
     * @return 评论表id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置评论表id
     * 
     * @param id
     *          评论表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取评论者的ip
     * 
     * @return 评论者的ip
     */
    public String getUserIp() {
        return this.userIp;
    }

    /**
     * 设置评论者的ip
     * 
     * @param userIp
     *          评论者的ip
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    /**
     * 获取评论名称
     * 
     * @return 评论名称
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * 设置评论名称
     * 
     * @param userName
     *          评论名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取评论内容
     * 
     * @return 评论内容
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 设置评论内容
     * 
     * @param content
     *          评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取评论日期
     * 
     * @return 评论日期
     */
    public Timestamp getCommentDate() {
        return this.commentDate;
    }

    /**
     * 设置评论日期
     * 
     * @param commentDate
     *          评论日期
     */
    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * 获取是否通过审核，0：待审核， 1：审核通过， 2：未通过，默认为0
     * 
     * @return 是否通过审核
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * 设置是否通过审核，0：待审核， 1：审核通过， 2：未通过，默认为0
     * 
     * @param state
     *          是否通过审核
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取父评论ID
     * 
     * @return 父评论ID
     */
    public String getToId() {
        return this.toId;
    }

    /**
     * 设置父评论ID
     * 
     * @param toId
     *          父评论ID
     */
    public void setToId(String toId) {
        this.toId = toId;
    }

    /**
     * 获取外键关联具体博客
     * 
     * @return 外键关联具体博客
     */
    public Integer getBlogId() {
        return this.blogId;
    }

    /**
     * 设置外键关联具体博客
     * 
     * @param blogId
     *          外键关联具体博客
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }
}