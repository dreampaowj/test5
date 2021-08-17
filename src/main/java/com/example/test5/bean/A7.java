package com.example.test5.bean;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Value;

@Value
@Document(indexName = "abc")
public class A7 {
	public String name;
	
	int age;
	
	@Field(type = FieldType.Text)
	private String city;
	
}
