package com.demo.dao;

import com.demo.entity.SysUser;

public interface SysUserMapper {

	public SysUser findSysUserByUserCode(String userCode);
}
