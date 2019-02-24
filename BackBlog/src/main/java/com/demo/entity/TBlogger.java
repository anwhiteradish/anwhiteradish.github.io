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
 * T_BLOGGER
 * 
 * @author chen
 * @version 1.0.0 2019-01-31
 */
public class TBlogger implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4581665158320672683L;

    /** 博主id */
    private Integer id;

    /** 博主姓名 */
    private String username;

    /** 博主密码 */
    private String password;

    /** 博主信息 */
    private String profile;

    /** 博主昵称 */
    private String nickname;

    /** 博主签名 */
    private String sign;

    /** 博主头像路径 */
    private String imagename;

    /**
     * 获取博主id
     * 
     * @return 博主id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置博主id
     * 
     * @param id
     *          博主id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取博主姓名
     * 
     * @return 博主姓名
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置博主姓名
     * 
     * @param username
     *          博主姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取博主密码
     * 
     * @return 博主密码
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置博主密码
     * 
     * @param password
     *          博主密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取博主信息
     * 
     * @return 博主信息
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * 设置博主信息
     * 
     * @param profile
     *          博主信息
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * 获取博主昵称
     * 
     * @return 博主昵称
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * 设置博主昵称
     * 
     * @param nickname
     *          博主昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取博主签名
     * 
     * @return 博主签名
     */
    public String getSign() {
        return this.sign;
    }

    /**
     * 设置博主签名
     * 
     * @param sign
     *          博主签名
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 获取博主头像路径
     * 
     * @return 博主头像路径
     */
    public String getImagename() {
        return this.imagename;
    }

    /**
     * 设置博主头像路径
     * 
     * @param imagename
     *          博主头像路径
     */
    public void setImagename(String imagename) {
        this.imagename = imagename;
    }
}