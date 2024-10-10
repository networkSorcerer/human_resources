package com.example.demo.hr.dao;

import java.util.List;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.hr.vo.HrVO;

@Mapper
public interface HrDAO {
	
	
	List<HrVO> hrList(Map<String, Object> paramMap);

}
