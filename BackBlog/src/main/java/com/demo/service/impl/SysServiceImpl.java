package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.SysPermissionMapper;
import com.demo.dao.SysUserMapper;
import com.demo.entity.SysPermission;
import com.demo.entity.SysUser;
import com.demo.service.SysService;
@Service
public class SysServiceImpl implements SysService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Autowired
	private SysPermissionMapper sysPermissionMapper;
	@Override
	public SysUser findSysUserByUserCode(String userCode) {
		
		return sysUserMapper.findSysUserByUserCode(userCode);
	}

	@Override
	public List<SysPermission> findMenuListByUserId(String userid) throws Exception {
		
		return sysPermissionMapper.findMenuListByUserId(userid);
	}

	@Override
	public List<SysPermission> findPermissionListByUserId(String userid) throws Exception {
		
		return sysPermissionMapper.findPermissionListByUserId(userid);
	}

	@Override
	public List<SysPermission> findMenuList() {
		
		return sysPermissionMapper.findMenuList();
	}

	@Override
	public List<SysPermission> findMenuListById(int id) {
		
		return sysPermissionMapper.findMenuListById(id);
	}

}
