package com.pmangplus.examples.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="person")
@Data
public class Person {

	@Id
	Long id;
	String name;
	
}
