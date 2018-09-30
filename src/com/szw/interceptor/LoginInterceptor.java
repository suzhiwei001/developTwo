package com.szw.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//项目名
		String contextPath = request.getContextPath();
		//请求路径
		String requestURI = request.getRequestURI();
		System.out.println(contextPath);
		System.out.println(requestURI);
		return true;
	}
}
