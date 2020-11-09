package com.threeb.house.search.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.threeb.house.search.dao.SearchDAO;
import com.threeb.house.vo.HouseVO;

@Service("searchService")
@Transactional(propagation = Propagation.REQUIRED) 
public class SearchServiceImpl implements SearchService {
	@Autowired
	SearchDAO searchDAO;
	
	@Override
	public List<HouseVO> listAllHouse(Map<String, Object> searchMap) throws Exception {
		return searchDAO.selectAllHouse(searchMap);
	}

}
