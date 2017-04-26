package com.lingdu.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lingdu.domain.User;

@RestController
public class UserRest {
	@RequestMapping(value="/user/user",method=RequestMethod.POST)
	public String add(User user){
		System.out.println("新增：" + user);
		return "新增成功！";
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable String id){
		System.out.println("删除成功：" + id);
		return "删除成功!";
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.PUT)
	public String update(@PathVariable String id,User user){
		System.out.println("修改成功：" + user);
		return "修改成功";
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public User select(@PathVariable String id){
		System.out.println("查询成功：" + id);
		User user = new User();
		user.setId("1");
		user.setName("lingdu");
		user.setSex("男");
		
		return user;
	}
}
