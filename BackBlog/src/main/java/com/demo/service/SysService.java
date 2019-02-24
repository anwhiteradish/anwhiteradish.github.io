package com.demo.service;

import java.util.List;

import com.demo.entity.SysPermission;
import com.demo.entity.SysUser;

public interface SysService {

	public SysUser findSysUserByUserCode(String userCode);
	
	//根据用户id查询权限范围的菜单
	public List<SysPermission> findMenuListByUserId(String userid) throws Exception;
	
	//根据用户id查询权限范围的url
	public List<SysPermission> findPermissionListByUserId(String userid) throws Exception;

	public List<SysPermission> findMenuList();

	public List<SysPermission> findMenuListById(int id);
}
