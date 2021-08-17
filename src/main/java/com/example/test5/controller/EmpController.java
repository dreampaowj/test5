package com.example.test5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test5.bean.Emp;
import com.example.test5.bean.Hobby;
import com.example.test5.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService empService;
	
	@GetMapping(value = "/insertEmp")
	public Emp addEmp(String username) {
		Emp emp = new Emp(username);
		List<Hobby> hobbies = new ArrayList<>();
		hobbies.add(new Hobby("football"));
		hobbies.add(new Hobby("tennies"));
		emp.setHobbies(hobbies);
		try {
			return empService.save(emp);
		} catch (Exception e) {
			e.printStackTrace();
			return new Emp();
		}
	}
}