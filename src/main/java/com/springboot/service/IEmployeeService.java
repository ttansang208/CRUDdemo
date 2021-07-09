package com.springboot.service;

import java.util.List;
import com.springboot.dto.Employee;

public interface IEmployeeService {
	
	public Employee addEmpl(Employee employee);
	
	public Employee updateEmpl(long id, Employee employee);
	
	public boolean deleteEmpl(long id);
	
	public List<Employee> getAllEmpl();
	
	public Employee getOneEmpl(long id);
}
