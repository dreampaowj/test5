package com.example.test5.service;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.test5.bean.Employee;

public interface EmployeeElasticsearchRepository extends ElasticsearchRepository<Employee, Integer> {
	Employee queryByUsername(String username);
}
