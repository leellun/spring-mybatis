package com.newland.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newland.ssm.bean.Employee;
import com.newland.ssm.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@ResponseBody
	@RequestMapping("/getemps")
	public List<Employee> emps(){
		List<Employee> emps = employeeService.getEmps();
		return emps;
	}

}
