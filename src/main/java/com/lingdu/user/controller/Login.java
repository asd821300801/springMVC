package com.lingdu.user.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
public class Login {
	/**
	 * 用于设置Session级别的国际化
	 * @param lang
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public String login(String lang,HttpSession session){
		Locale loc = null;
		if("zh".equals(lang)){
			loc = new Locale("zh", "CN");
		}else{
			loc = new Locale("en", "US");
		}
		//设置session
		session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,loc);
		return "login";
	}
	
	/**
	 * 用于测试其他页面是否被引用
	 * @return
	 */
	@RequestMapping("/login2")
	public String login(){
		
		return "login";
		
	}
}
