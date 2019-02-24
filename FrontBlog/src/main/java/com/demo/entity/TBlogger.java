package com.demo.entity;

import java.io.Serializable;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-01-15
 */
public class TBlogger  implements Serializable{
    /**
     * 博主id
     */
    private Integer id;

    /**
     * 博主姓名
     */
    private String username;

    /**
     * 博主密码
     */
    private String password;

    /**
     * 博主信息
     */
    private String profile;

    /**
     * 博主昵称
     */
    private String nickname;

    /**
     * 博主签名
     */
    private String sign;

    /**
     * 博主头像路径
     */
    private String imagename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename == null ? null : imagename.trim();
    }
}