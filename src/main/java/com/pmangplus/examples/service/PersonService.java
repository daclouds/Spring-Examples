package com.pmangplus.examples.service;

import java.util.List;

import com.pmangplus.examples.domain.Person;

public interface PersonService {

	void gainExperience(Long id);

	List<Person> findAll(String nameLike);

}
