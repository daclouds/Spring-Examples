package com.pmangplus.examples.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

import com.mysema.query.annotations.QueryEntity;

@Entity
@QueryEntity
@Data
@XmlRootElement
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@Column(name="email", unique=true)
	String email; 

	String name;

	Long energy;
	
}
