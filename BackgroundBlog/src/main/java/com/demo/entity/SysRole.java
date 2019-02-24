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
 * SYS_ROLE
 * 
 * @author chen
 * @version 1.0.0 2019-01-31
 */
public class SysRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -443939560806388854L;

    /** id */
    private String id;

    /** name */
    private String name;

    /** 是否可用,1：可用，0不可用 */
    private Integer available;

    /**
     * 获取id
     * 
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取name
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否可用,1：可用，0不可用
     * 
     * @return 是否可用,1：可用
     */
    public Integer getAvailable() {
        return this.available;
    }

    /**
     * 设置是否可用,1：可用，0不可用
     * 
     * @param available
     *          是否可用,1：可用
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }
}