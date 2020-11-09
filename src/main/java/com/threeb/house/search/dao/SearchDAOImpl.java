package com.threeb.house.search.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.threeb.house.vo.HouseVO;

@Repository("searchDAO")
public class SearchDAOImpl implements SearchDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<HouseVO> selectAllHouse(Map<String, Object> searchMap) throws DataAccessException {
		return sqlSession.selectList("mapper.search.selectAllHouse", searchMap);
	}

	@Override
	public List<HouseVO> ableHouse(List<HouseVO> houseList) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
