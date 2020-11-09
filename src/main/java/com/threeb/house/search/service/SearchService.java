package com.threeb.house.search.service;

import java.util.List;
import java.util.Map;

import com.threeb.house.vo.HouseVO;



public interface SearchService {
	public List<HouseVO> listAllHouse(Map<String, Object> searchMap) throws Exception;
}
