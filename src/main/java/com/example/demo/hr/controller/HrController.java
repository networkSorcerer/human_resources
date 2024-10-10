package com.example.demo.hr.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.hr.service.HrService;
import com.example.demo.hr.vo.HrVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/hr/")
@Slf4j
public class HrController {
	
	@Setter(onMethod_=@Autowired)
	private HrService service;
	
	@RequestMapping("employee.do")
	@ResponseBody
	public Map<String, Object> Employee (Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session)throws Exception {
		
		Map<String , Object> returnMap = new HashMap<String, Object>();
		
		List<HrVO> listdata = service.hrList(paramMap);
		
		returnMap.put("listdata",listdata);
		
		return returnMap;
		
	}

}
