package com.demo.entity;

import java.io.Serializable;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-01-15
 */
public class TBlogtype  implements Serializable{
    /**
     * 博客id
     */
    private Integer id;

    /**
     * 博客类别
     */
    private String typeName;

    /**
     * 博客排序
     */
    private Integer orderNum;

    /**
     * 是否显示，1：显示；0：不显示，默认为1
     */
    private Boolean isShow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}