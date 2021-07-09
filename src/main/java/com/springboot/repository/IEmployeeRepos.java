package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dto.Employee;

@Repository
public interface IEmployeeRepos extends JpaRepository<Employee, Long> {

}
