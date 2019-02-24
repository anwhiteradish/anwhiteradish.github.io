package com.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.SysPermission;
import com.demo.service.SysService;
import com.google.gson.Gson;

@Controller
public class IndexController {

	@Autowired
	private SysService sysService;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<SysPermission> findMenuList = sysService.findMenuList();
		/*List<SysPermission> topMenu=new ArrayList<SysPermission>();
		for (SysPermission sysPermission : findMenuList) {
			if(sysPermission.getParentid()==1) {
				topMenu.add(sysPermission);
			}
		}*/
		model.addAttribute("categoryList", findMenuList);
		
		
		  /*List<SysPermission> secondMenu=new ArrayList<SysPermission>();
		  for (SysPermission sysPermission : findMenuList) {
			if(sysPermission.getParentid()==1) {
				topMenu.add(sysPermission);
			}
			
		}
		
			for (SysPermission parent : topMenu) {
				for(SysPermission menuList:findMenuList) {
					if(parent.getId()==menuList.getParentid()) {
						secondMenu.add(menuList);
					}
				}
			}
			
		model.addAttribute("topMenu", topMenu);
		model.addAttribute("secondMenu", secondMenu);*/
		return "index";
	}
	/*@RequestMapping("/selectSecondMenu")
	@ResponseBody
	public void selectSecondMenu(int id,HttpServletResponse response) throws Exception {
		List<SysPermission> list = sysService.findMenuListById(id);
		response.setContentType("text/html; charset=UTF-8");
		JSONArray fromObject = JSONArray.fromObject(list);
		Gson gson=new Gson();
		String json = gson.toJson(list);
		System.out.println(json);
		response.getWriter().write(json);
	}*/
	
}
