package com.example.test5.bean;

import javax.persistence.Embeddable;

import org.jmolecules.ddd.annotation.ValueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ValueObject
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hobby {

	private String name;

}
