package com.example.test5.bean;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	@Id
	@GeneratedValue
	private Long id;
	private String username;
	
	@ElementCollection
	@CollectionTable(name = "hobby")
	private List<Hobby> hobbies;
	
	public Emp(String username) {
		this.username = username;
	}

}
