package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.Employee;
import com.springboot.service.IEmployeeService;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmpl(employee);
	}
	
	@GetMapping("/list")
	public List<Employee> getAll(){
		return employeeService.getAllEmpl();
	}
	
	@GetMapping("/getone/{id}")
	public Employee getOne(@PathVariable("id") long id) {
		return employeeService.getOneEmpl(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteEmployee(@PathVariable("id") long id) {
		return employeeService.deleteEmpl(id);
	}
	
	@PutMapping("/update")
	public Employee UpdateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		return employeeService.updateEmpl(id, employee);
	}
}
