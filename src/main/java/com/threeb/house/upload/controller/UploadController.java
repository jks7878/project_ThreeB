package com.threeb.house.upload.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface UploadController {
	
	public ModelAndView uploadPage(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
