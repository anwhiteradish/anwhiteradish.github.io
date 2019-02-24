package com.demo.dao;

import java.util.List;

import com.demo.entity.SysPermission;

public interface SysPermissionMapper {

	
	public List<SysPermission> findMenuListByUserId(String userid);
	
	public List<SysPermission> findPermissionListByUserId(String userid);

	public List<SysPermission> findMenuList();

	public List<SysPermission> findMenuListById(int id);
}
