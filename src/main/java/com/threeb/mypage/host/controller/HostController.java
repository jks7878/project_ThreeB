package com.threeb.mypage.host.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface HostController {
	
	public ModelAndView hostPage(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
