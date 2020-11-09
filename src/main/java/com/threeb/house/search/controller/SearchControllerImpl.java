package com.threeb.house.search.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.threeb.house.search.service.SearchService;
import com.threeb.house.vo.HouseVO;

import net.sf.json.JSONArray;




@Controller("searchController")
@EnableAspectJAutoProxy
public class SearchControllerImpl implements SearchController {
	@Autowired
	SearchService searchService;
	@Autowired
	HouseVO houseVO;
	
	private static final Logger logger = LoggerFactory.getLogger(SearchControllerImpl.class);
	
	@Override
	@RequestMapping(value="/board/searchArticles.do", method=RequestMethod.GET)
	public String searchHouse(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {	
		String addr = (String)request.getParameter("address");
		model.addAttribute("location", addr);
		String start = (String)request.getParameter("start");
		String end = (String)request.getParameter("end");
		int person = Integer.parseInt(request.getParameter("person"));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("location", addr);
		map.put("start", start);
		map.put("end", end);
		map.put("person", person);
		List<HouseVO> houseList = searchService.listAllHouse(map);
		
		 
		ObjectMapper objMapper = new ObjectMapper();
		JSONArray jsonArray = new JSONArray();
		String jsonList = null;
		for(HouseVO house : houseList) {
			jsonList = objMapper.writeValueAsString(house);
			System.out.println("jsonList : " + jsonList);
			jsonArray.add(jsonList);
		}
		System.out.println("jsonArray : " + jsonArray);
		model.addAttribute("houseList", jsonArray);
		
		/*
		 * List<String> addrList = new ArrayList<String>(); List<Integer> chargeList =
		 * new ArrayList<Integer>(); for(HouseVO house : houseList) {
		 * addrList.add(house.getLocation()); chargeList.add(house.getHouseCharge()); }
		 * session.setAttribute("addrList", addrList);
		 * session.setAttribute("chargeList", chargeList);
		 */
		

		return "result";
	}

	@Override
	@RequestMapping(value="/board/listArticles.do", method=RequestMethod.GET)
	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		System.out.println(viewName);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}

	
}
