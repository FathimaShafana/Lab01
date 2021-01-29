package com.example.demo.dao;

import com.example.demo.model.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
public interface EmployeeDao extends CrudRepository<Employee,Integer>{

	List<Employee> findByName(String name);
	
	@Query("from Employee where netvalue = ?1 order by name")
	List<Employee> findByNetValueSorted(double netvalue);
	
}
