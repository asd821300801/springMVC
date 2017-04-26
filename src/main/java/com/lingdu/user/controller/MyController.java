package com.lingdu.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lingdu.domain.User;

//控制层
@Controller
@RequestMapping("/my")//请求映射
public class MyController {
	//SpringMVC的控制层对象都是单例的，绑定输入参数，必须写在方法参数上
		//返回String类型，表示只返回view（相对路径）
		@RequestMapping(value="/index")//
		public String index(@RequestParam(required=true) String name, User user,
				HttpServletRequest request,@CookieValue(name="JSESSIONID") String id,@RequestHeader(name="Host") String host){
			
			System.out.println(name);
			System.out.println(user);
			System.out.println("sid：" + id);
			request.setAttribute("user", user);
			System.out.println(host);
			return "user/list";
		}
}
