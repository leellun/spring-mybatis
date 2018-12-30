package com.newland.ssm.dao;


import java.util.List;

import com.newland.ssm.bean.Employee;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getEmps();
	

}
