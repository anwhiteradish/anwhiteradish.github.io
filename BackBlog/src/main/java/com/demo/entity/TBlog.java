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
 * T_BLOG
 * 
 * @author chen
 * @version 1.0.0 2019-01-31
 */
public class TBlog implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5770738697526866969L;

    /** 博客类型 */
    private Integer id;

    /** 博客题目 */
    private String title;

    /** 博客摘要 */
    private String summary;

    /** 发布日期 */
    private Timestamp releaseDate;

    /** 评论次数 */
    private Integer readCount;

    /** 回复次数 */
    private Integer commentCount;

    /** 博客内容 */
    private String content;

    /** 关键字 */
    private String keyWord;

    /** 博客类型，1：原创；2：转载；3：翻译 */
    private Integer blogType;

    /** 是否显示，1：显示；0：不显示，默认为1 */
    private Integer isShow;

    /** 是否可以评论，1：可以；0：不可以，默认为1 */
    private Integer isReply;

    /** 是否推荐，1：推荐；0：不推荐，默认为0 */
    private Integer isCommend;

    /** 外键关联博客类别 */
    private Integer typeId;

    /**
     * 获取博客类型
     * 
     * @return 博客类型
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置博客类型
     * 
     * @param id
     *          博客类型
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取博客题目
     * 
     * @return 博客题目
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * 设置博客题目
     * 
     * @param title
     *          博客题目
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取博客摘要
     * 
     * @return 博客摘要
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * 设置博客摘要
     * 
     * @param summary
     *          博客摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取发布日期
     * 
     * @return 发布日期
     */
    public Timestamp getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * 设置发布日期
     * 
     * @param releaseDate
     *          发布日期
     */
    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * 获取评论次数
     * 
     * @return 评论次数
     */
    public Integer getReadCount() {
        return this.readCount;
    }

    /**
     * 设置评论次数
     * 
     * @param readCount
     *          评论次数
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * 获取回复次数
     * 
     * @return 回复次数
     */
    public Integer getCommentCount() {
        return this.commentCount;
    }

    /**
     * 设置回复次数
     * 
     * @param commentCount
     *          回复次数
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 获取博客内容
     * 
     * @return 博客内容
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 设置博客内容
     * 
     * @param content
     *          博客内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取关键字
     * 
     * @return 关键字
     */
    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * 设置关键字
     * 
     * @param keyWord
     *          关键字
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    /**
     * 获取博客类型，1：原创；2：转载；3：翻译
     * 
     * @return 博客类型
     */
    public Integer getBlogType() {
        return this.blogType;
    }

    /**
     * 设置博客类型，1：原创；2：转载；3：翻译
     * 
     * @param blogType
     *          博客类型
     */
    public void setBlogType(Integer blogType) {
        this.blogType = blogType;
    }

    /**
     * 获取是否显示，1：显示；0：不显示，默认为1
     * 
     * @return 是否显示
     */
    public Integer getIsShow() {
        return this.isShow;
    }

    /**
     * 设置是否显示，1：显示；0：不显示，默认为1
     * 
     * @param isShow
     *          是否显示
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取是否可以评论，1：可以；0：不可以，默认为1
     * 
     * @return 是否可以评论
     */
    public Integer getIsReply() {
        return this.isReply;
    }

    /**
     * 设置是否可以评论，1：可以；0：不可以，默认为1
     * 
     * @param isReply
     *          是否可以评论
     */
    public void setIsReply(Integer isReply) {
        this.isReply = isReply;
    }

    /**
     * 获取是否推荐，1：推荐；0：不推荐，默认为0
     * 
     * @return 是否推荐
     */
    public Integer getIsCommend() {
        return this.isCommend;
    }

    /**
     * 设置是否推荐，1：推荐；0：不推荐，默认为0
     * 
     * @param isCommend
     *          是否推荐
     */
    public void setIsCommend(Integer isCommend) {
        this.isCommend = isCommend;
    }

    /**
     * 获取外键关联博客类别
     * 
     * @return 外键关联博客类别
     */
    public Integer getTypeId() {
        return this.typeId;
    }

    /**
     * 设置外键关联博客类别
     * 
     * @param typeId
     *          外键关联博客类别
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}