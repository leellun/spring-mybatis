package com.newland.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newland.ssm.bean.Employee;
import com.newland.ssm.dao.EmployeeMapper;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	public List<Employee> getEmps() {
		return employeeMapper.getEmps();
	}

}
