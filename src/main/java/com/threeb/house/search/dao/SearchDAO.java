package com.threeb.house.search.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.threeb.house.vo.HouseVO;


public interface SearchDAO {
	public List<HouseVO> selectAllHouse(Map<String, Object> searchMap) throws DataAccessException;
	public List<HouseVO> ableHouse(List<HouseVO> houseList) throws DataAccessException;
}
