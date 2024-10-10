package com.example.demo.hr.service;

import java.util.List;
import java.util.Map;


import com.example.demo.hr.vo.HrVO;


public interface HrService {

	List<HrVO> hrList(Map<String, Object> paramMap);

}
