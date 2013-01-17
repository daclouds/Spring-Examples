package com.pmangplus.examples.service;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pmangplus.examples.domain.Score;
import com.pmangplus.examples.repository.ScoreRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/spring/root-context.xml")
public class PersonServiceImplTest {

	@Inject
	PersonService personService;
	
	@Inject
	ScoreRepository scoreRepository;
	
	@Test
	public void testTransaction() {
		Long id = 1L;
		
		personService.gainExperience(id);
		
		Score score = scoreRepository.findOne(id);
		System.out.println(score);
		
	}

}