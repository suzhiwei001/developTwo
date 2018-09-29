package com.szw.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szw.pojo.User;
import com.szw.test.ExportExcelUtil;
@RequestMapping("ExportExcelController")
@Controller
public class ExportExcelController {
	@RequestMapping("exportList") 
	public void exportList(HttpServletResponse response, String ids) { 
	   
	   String fileName = "人员档案列表"; 
	   //List<User> users = sRPService.exportList(ids); 
	   ArrayList<User> users = new ArrayList<User>();
	   User user = new User();
	   user.setId(111);
	   user.setUsername("小王");
	   user.setSex("男");
	   user.setAddress("北京");
	   user.setBirthday("20180105");
	   users.add(user);
	   // 列名
	   String columnNames[] = { "ID", "姓名", "性别", "地址", "生日" }; 
	   // map中的key
	   String keys[] = { "id", "username", "sex", "address", "birthday"};
	   try { 
		   ExportExcelUtil.start_download(response, fileName, users,columnNames, keys); 
	   } catch (IOException e) { 
	     e.printStackTrace(); 
	   } 
	}
}
