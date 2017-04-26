import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogInterceptor implements HandlerInterceptor {
	private long begin;
	private long end;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//controller方法执行之前：false表示不继续执行，true表示继续执行
		//一般在这里做权限控制
		begin = System.currentTimeMillis();
		System.out.println("preHandle ： true : " + begin);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//controller方法执行之后
		end = System.currentTimeMillis();
		System.out.println("postHandle：controller方法执行之后 ： " + (end-begin)/1000f);
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//Thread.sleep(5000);
		//页面渲染之后
		//一般做一些清理操作
		end = System.currentTimeMillis();
		System.out.println("afterCompletion：页面渲染之后 : " + (end-begin)/1000f);

	}

}
