package com.demo.entity;

import java.io.Serializable;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-01-15
 */
public class TLink  implements Serializable{
    /**
     * 友情链接表id
     */
    private Integer id;

    /**
     * 友情链接名
     */
    private String linkname;

    /**
     * 友情链接url
     */
    private String linkurl;

    /**
     * 链接排序
     */
    private Integer orderNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl == null ? null : linkurl.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}