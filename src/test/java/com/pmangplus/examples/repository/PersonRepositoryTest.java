package com.pmangplus.examples.repository;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pmangplus.examples.domain.Person;
import com.pmangplus.examples.service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/spring/root-context.xml")
public class PersonRepositoryTest {

	@Inject
	PersonRepository repository;
	
	@Inject
	PersonService service;
	
	@Ignore
	@Test
	public void testInjection() {
		assertNotNull(repository);
	}
	
	@Test
	public void testSave() throws Exception {
		Person nolleh = new Person();
		nolleh.setName("김경미");
		nolleh.setEmail("nolleh@neowiz.com");
		repository.save(nolleh);
		
		Person omnimook = new Person();
		omnimook.setName("최윤묵");
		omnimook.setEmail("omnimook@neowiz.com");
		repository.save(omnimook);
	}
	
	@Test
	public void testFind() throws Exception {
		List<Person> persons = service.findAll("김");
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
