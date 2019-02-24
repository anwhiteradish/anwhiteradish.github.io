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
 * T_BLOGTYPE
 * 
 * @author chen
 * @version 1.0.0 2019-01-31
 */
public class TBlogtype implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8208270108085168738L;

    /** 博客id */
    private Integer id;

    /** 博客类别 */
    private String typeName;

    /** 博客排序 */
    private Integer orderNum;

    /** 是否显示，1：显示；0：不显示，默认为1 */
    private Integer isShow;

    /**
     * 获取博客id
     * 
     * @return 博客id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置博客id
     * 
     * @param id
     *          博客id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取博客类别
     * 
     * @return 博客类别
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * 设置博客类别
     * 
     * @param typeName
     *          博客类别
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取博客排序
     * 
     * @return 博客排序
     */
    public Integer getOrderNum() {
        return this.orderNum;
    }

    /**
     * 设置博客排序
     * 
     * @param orderNum
     *          博客排序
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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
}