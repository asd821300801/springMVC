package com.lingdu.user.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lingdu.domain.User;

/**
 * 控制层
 * @author Administrator
 *
 */
//控制层
@Controller
@RequestMapping("/user")//请求映射
public class UserController {

	//SpringMVC的控制层对象都是单例的，绑定输入参数，必须写在方法参数上
	//返回String类型，表示只返回view（相对路径）
	@RequestMapping(value="/index",method=RequestMethod.GET)//设置请求方法为GET请求
	public String index(@RequestParam(required=true) String name, User user,
			HttpServletRequest request,@CookieValue(name="JSESSIONID") String id,@RequestHeader(name="Host") String host){
		
		System.out.println(name);
		System.out.println(user);
		System.out.println("sid：" + id);
		request.setAttribute("user", user);
		System.out.println(host);
		//return "user/list";//默认是服务端跳转
		return "redirect:/user/view?id=302";//客户端跳转
	}
	
	@RequestMapping("/view")
	public String viewUser(Integer id,ModelMap map){
		System.out.println(id);
		User user = new User();
		user.setId(id + "");
		user.setName("LingDu");
		user.setSex("男");
		map.addAttribute("user", user);
		
		return "user/view";
		
	}
	
	@RequestMapping("/view2")
	public ModelAndView viewUser2(Integer id,ModelAndView mav){
		System.out.println(id);
		User user = new User();
		user.setId(id + "");
		user.setName("View2 : LingDu");
		user.setSex("男");
		//设置属性，跟ModelMap差不多
		mav.addObject("user", user);
		//设置视图
		mav.setViewName("user/view");
		mav.setViewName("user/list");
		return mav;
		
	}
	
	/**
	 * 输出一个json
	 * @ResponseBody //加在public 前面
	 * @param id
	 * @return
	 */
	@RequestMapping("/viewRest")
	public @ResponseBody User viewRest(Integer id){
		System.out.println(id);
		User user = new User();
		user.setId(id + "");
		user.setName("View2 : LingDu");
		user.setSex("男");
		
		return user;
		
	}
	/**
	 * 输出网页
	 * @return
	 */
	@RequestMapping("/viewHtml")
	public @ResponseBody String viewRest(){
		String html = "<a href='www.baidu.com'>百度</a>";
		
		return html.replace("\"", "");
		
	}
	
	@RequestMapping("/ztree")
	public String ztree(){
		return "user/index";
		
	}
}
