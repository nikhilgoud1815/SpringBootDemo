package com.cg.rest.restServices;

import java.util.List;

import org.springframework.stereotype.Service;

public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
