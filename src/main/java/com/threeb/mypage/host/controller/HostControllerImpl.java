package com.threeb.mypage.host.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("hostController")
public class HostControllerImpl implements HostController {
	
	//숙소 관리 페이지
	@Override
	@RequestMapping(value = {"/mypage/host.do"}, method = RequestMethod.GET)
	public ModelAndView hostPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName=(String)request.getAttribute("viewName");
		ModelAndView mav=new ModelAndView(viewName);
		return mav;
	}
	
}
