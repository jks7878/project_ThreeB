package com.threeb.house.upload.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("uploadController")
public class UploadControllerImpl implements UploadController {

	//숙소 등록 페이지
	@Override
	@RequestMapping(value = {"/house/upload.do"}, method = RequestMethod.GET)
	public ModelAndView uploadPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName=(String)request.getAttribute("viewName");
		ModelAndView mav=new ModelAndView(viewName);
		return mav;
	}

}
