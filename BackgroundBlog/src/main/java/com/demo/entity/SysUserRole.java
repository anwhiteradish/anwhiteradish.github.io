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
 * SYS_USER_ROLE
 * 
 * @author chen
 * @version 1.0.0 2019-01-31
 */
public class SysUserRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8932584459202949409L;

    /** id */
    private String id;

    /** sysUserId */
    private String sysUserId;

    /** sysRoleId */
    private String sysRoleId;

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
     * 获取sysUserId
     * 
     * @return sysUserId
     */
    public String getSysUserId() {
        return this.sysUserId;
    }

    /**
     * 设置sysUserId
     * 
     * @param sysUserId
     */
    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * 获取sysRoleId
     * 
     * @return sysRoleId
     */
    public String getSysRoleId() {
        return this.sysRoleId;
    }

    /**
     * 设置sysRoleId
     * 
     * @param sysRoleId
     */
    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId;
    }
}