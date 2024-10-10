package com.example.demo.hr.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class HrVO {
	private String EMPLOYEE_ID;
	private String FIRST_NAME;	
	private String LAST_NAME;
	private String EMAIL;
	private String PHONE_NUMBER;
	private String HIRE_DATE;
	private String JOB_ID;
	private String SALARY;
	private String COMMISSION_PCT;
	private String MANAGER_ID;
	private String DEPARTMENT_ID;

}
