package com.example.test5.bean;

import java.util.Date;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "create")
public class A5 {
	private String name;
	
	private final int age;
	
	public Date birth;
	
	String city;
	
	@NonNull
	public String street;
	
	public final String country;
}
