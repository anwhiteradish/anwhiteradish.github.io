package com.demo.shiro;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.entity.ActiveUser;
import com.demo.entity.SysPermission;
import com.demo.entity.SysUser;
import com.demo.service.SysService;

public class DbRealm extends AuthorizingRealm{

	
		//注入service
		@Autowired
		private SysService sysService;

		// 设置realm的名称
		@Override
		public void setName(String name) {
			super.setName("dbRealm");
		}
	
		//realm的认证方法，从数据库查询用户信息
		@Override
		protected AuthenticationInfo doGetAuthenticationInfo(
				AuthenticationToken token) throws AuthenticationException {
			
			// token是用户输入的用户名和密码 
			// 第一步从token中取出用户名
			String userCode = (String) token.getPrincipal();

			// 第二步：根据用户输入的userCode从数据库查询
			SysUser sysUser = null;
			try {
				sysUser = sysService.findSysUserByUserCode(userCode);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// 如果查询不到返回null
			if(sysUser==null){//
				return null;
			}
			// 从数据库查询到密码
			String password = sysUser.getPassword();
			
			//盐
			String salt = sysUser.getSalt();

			// 如果查询到返回认证信息AuthenticationInfo
			
			//activeUser就是用户身份信息
			ActiveUser activeUser = new ActiveUser();
			
			activeUser.setUserid(sysUser.getId());
			activeUser.setUsercode(sysUser.getUsercode());
			activeUser.setUsername(sysUser.getUsername());
			//..
			
			//根据用户id取出菜单
			List<SysPermission> menus  = null;
			try {
				//通过service取出菜单 
				menus = sysService.findMenuListByUserId(sysUser.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//将用户菜单 设置到activeUser
			activeUser.setMenus(menus);

			//将activeUser设置simpleAuthenticationInfo
			SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
					activeUser, password,ByteSource.Util.bytes(salt), this.getName());

			return simpleAuthenticationInfo;
		}
		
		

		// 用于授权
		@Override
		protected AuthorizationInfo doGetAuthorizationInfo(
				PrincipalCollection principals) {
			
			

			return null;
		}
		
		//清除缓存
		public void clearCached() {
			PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
			super.clearCache(principals);
		}


}
