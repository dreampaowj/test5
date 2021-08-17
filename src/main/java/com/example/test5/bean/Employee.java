package com.example.test5.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "test5")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Field
	private String username;
	
	@Field
	private int age;
	
	@Field
	private String description;
	
	public Employee(String description) {
		this.description = description;
	}
}
