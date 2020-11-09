package com.threeb.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ViewNameInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		try {
			String viewName = getViewName(request);
			request.setAttribute("viewName", viewName);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	private String getViewName(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}
		// http://localhost:8090/test/index.do?name=금영석
		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}
		// contextPath.length() => http://localhost:8090/
		
		int end = 0;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}
		// http://localhost:8090/test/index.do?name=금영석
		// end => http://localhost:8090/test/index.do 의 index 값
		
		String fileName = uri.substring(begin, end);
		// /test/index.do
		
		if(fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0,fileName.lastIndexOf("."));
		}
		// /test/index
		
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/",1), fileName.length());
		}
		// /index 
		System.out.println("뷰네임 : " + fileName);
		return fileName;
	}

}
