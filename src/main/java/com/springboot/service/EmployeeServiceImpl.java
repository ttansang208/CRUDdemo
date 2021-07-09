package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dto.Employee;
import com.springboot.repository.IEmployeeRepos;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	private IEmployeeRepos iEmployeeRepos;
	
	@Override
	public Employee addEmpl(Employee employee) {
		if(employee != null) {
			return iEmployeeRepos.save(employee);
		}
		return null;
	}

	@Override
	public Employee updateEmpl(long id, Employee employee) {
		if(employee != null) {
			Employee employee1 = iEmployeeRepos.getById(id);
			if(employee1 != null) {
				employee1.setName(employee.getName());
				employee1.setPhone(employee.getPhone());
				employee1.setEmail(employee.getEmail());
				return iEmployeeRepos.save(employee1);
			}
		}
		return null;
	}

	@Override
	public boolean deleteEmpl(long id) {
		if(id >= 1) {
			Employee employee = iEmployeeRepos.getById(id);
			if(employee!=null) iEmployeeRepos.delete(employee);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> getAllEmpl() {
		return iEmployeeRepos.findAll();
	}

	@Override
	public Employee getOneEmpl(long id) {
		return iEmployeeRepos.getById(id);
	}

}
