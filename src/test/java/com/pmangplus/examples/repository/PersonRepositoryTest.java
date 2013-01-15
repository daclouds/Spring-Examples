package com.pmangplus.examples.repository;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/spring/root-context.xml")
public class PersonRepositoryTest {

	@Inject
	PersonRepository repository;
	
	@Test
	public void test() {
		assertNotNull(repository);
	}

}
