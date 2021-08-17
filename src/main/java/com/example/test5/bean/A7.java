package com.example.test5.bean;

import org.jmolecules.architecture.onion.simplified.DomainRing;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Value;

@Value
@Document(indexName = "abc")
@DomainRing
public class A7 {
	public String name;
	
	int age;
	
	@Field(type = FieldType.Text)
	private String city;
	
}
