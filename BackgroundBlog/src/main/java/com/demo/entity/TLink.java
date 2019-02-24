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

/**
 * T_LINK
 * 
 * @author chen
 * @version 1.0.0 2019-01-31
 */
public class TLink implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 350941584045759234L;

    /** 友情链接表id */
    private Integer id;

    /** 友情链接名 */
    private String linkname;

    /** 友情链接url */
    private String linkurl;

    /** 链接排序 */
    private Integer orderNum;

    /**
     * 获取友情链接表id
     * 
     * @return 友情链接表id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置友情链接表id
     * 
     * @param id
     *          友情链接表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取友情链接名
     * 
     * @return 友情链接名
     */
    public String getLinkname() {
        return this.linkname;
    }

    /**
     * 设置友情链接名
     * 
     * @param linkname
     *          友情链接名
     */
    public void setLinkname(String linkname) {
        this.linkname = linkname;
    }

    /**
     * 获取友情链接url
     * 
     * @return 友情链接url
     */
    public String getLinkurl() {
        return this.linkurl;
    }

    /**
     * 设置友情链接url
     * 
     * @param linkurl
     *          友情链接url
     */
    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    /**
     * 获取链接排序
     * 
     * @return 链接排序
     */
    public Integer getOrderNum() {
        return this.orderNum;
    }

    /**
     * 设置链接排序
     * 
     * @param orderNum
     *          链接排序
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}