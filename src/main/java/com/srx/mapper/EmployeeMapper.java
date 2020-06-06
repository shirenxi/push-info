package com.srx.mapper;

import com.srx.bean.Employee;

public interface EmployeeMapper {
	
	public void insertByEmployee(Employee employee);
	
	public Employee selectById(Integer id);
}
