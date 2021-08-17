package com.example.test5.elasticsearch;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test5.bean.Employee;
import com.example.test5.service.EmployeeElasticsearchRepository;

@RestController
public class EmployeeElasticsearchController {
	@Autowired
	private EmployeeElasticsearchRepository employeeElasticsearchRepository;
	
	@GetMapping(value = "/addEmployeeToEla")
	public Employee addEmployeeToEla(String username, int age, String description) {
		Employee emp = new Employee(null, username, age, description);
		return this.employeeElasticsearchRepository.save(emp);
	}
	
	@GetMapping(value = "/queryEla")
	public Employee queryEla(int id) {
		Optional<Employee> emps = this.employeeElasticsearchRepository.findById(id);
		return emps.isPresent() ? emps.get() : new Employee("not found");
	}
	
	@GetMapping(value = "/username")
	public Employee username(String username) {
		Employee emp = this.employeeElasticsearchRepository.queryByUsername(username);
		return emp != null ? emp : new Employee("not found");
	}
}
