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
 * SYS_USER
 * 
 * @author chen
 * @version 1.0.0 2019-01-31
 */
public class SysUser implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8873151138113765205L;

    /** 主键 */
    private String id;

    /** 账号 */
    private String usercode;

    /** 姓名 */
    private String username;

    /** 密码 */
    private String password;

    /** 盐 */
    private String salt;

    /** 账号是否锁定，1：锁定，0未锁定 */
    private Integer locked;

    /**
     * 获取主键
     * 
     * @return 主键
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置主键
     * 
     * @param id
     *          主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取账号
     * 
     * @return 账号
     */
    public String getUsercode() {
        return this.usercode;
    }

    /**
     * 设置账号
     * 
     * @param usercode
     *          账号
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    /**
     * 获取姓名
     * 
     * @return 姓名
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置姓名
     * 
     * @param username
     *          姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     * 
     * @return 密码
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置密码
     * 
     * @param password
     *          密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取盐
     * 
     * @return 盐
     */
    public String getSalt() {
        return this.salt;
    }

    /**
     * 设置盐
     * 
     * @param salt
     *          盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取账号是否锁定，1：锁定，0未锁定
     * 
     * @return 账号是否锁定
     */
    public Integer getLocked() {
        return this.locked;
    }

    /**
     * 设置账号是否锁定，1：锁定，0未锁定
     * 
     * @param locked
     *          账号是否锁定
     */
    public void setLocked(Integer locked) {
        this.locked = locked;
    }
}