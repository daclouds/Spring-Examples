package com.pmangplus.examples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.pmangplus.examples.domain.Person;
import com.pmangplus.examples.domain.QPerson;
import com.pmangplus.examples.domain.Score;
import com.pmangplus.examples.repository.PersonRepository;
import com.pmangplus.examples.repository.ScoreRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	ScoreRepository scoreRepository;
	
	@Transactional
	@Override
	public void gainExperience(Long id) {
		Person entity = personRepository.findOne(id);
		
		Long currEnergy = entity.getEnergy();
		if (currEnergy == null || currEnergy <= 0L) {
			entity.setEnergy(5L);
		} else {
			entity.setEnergy(currEnergy - 1);
		}
		
		personRepository.save(entity);
		
		Score score = scoreRepository.findOne(id);
		if (score != null) {
			if (score.getScore() == null) score.setScore(0L);
			score.setScore(score.getScore() + 10);
		} else {
			score = new Score();
			score.setId(id);
			score.setScore(0L);
		}
		
		scoreRepository.save(score);
		
	}
	
	@Cacheable(value="persons")
	@Override
	public List<Person> findAll(String nameLike) {
		QPerson $ = QPerson.person;
		Iterable<Person> persons = personRepository.findAll($.name.like(nameLike+"%"));
		return Lists.newArrayList(persons);
	}
	
}
