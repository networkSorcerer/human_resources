package com.example.demo.hr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hr.dao.HrDAO;
import com.example.demo.hr.vo.HrVO;

import lombok.Setter;

@Service
public class HrServiceImpl implements HrService{
	
	@Setter(onMethod_=@Autowired)
	private HrDAO hrdao;
	
	@Override
	public List<HrVO> hrList(Map<String, Object> paramMap) {
		
		return hrdao.hrList(paramMap);
	}

}
