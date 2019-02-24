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
 * SYS_ROLE_PERMISSION
 * 
 * @author chen
 * @version 1.0.0 2019-01-31
 */
public class SysRolePermission implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2849626697265911131L;

    /** id */
    private String id;

    /** 角色id */
    private String sysRoleId;

    /** 权限id */
    private String sysPermissionId;

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
     * 获取角色id
     * 
     * @return 角色id
     */
    public String getSysRoleId() {
        return this.sysRoleId;
    }

    /**
     * 设置角色id
     * 
     * @param sysRoleId
     *          角色id
     */
    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    /**
     * 获取权限id
     * 
     * @return 权限id
     */
    public String getSysPermissionId() {
        return this.sysPermissionId;
    }

    /**
     * 设置权限id
     * 
     * @param sysPermissionId
     *          权限id
     */
    public void setSysPermissionId(String sysPermissionId) {
        this.sysPermissionId = sysPermissionId;
    }
}