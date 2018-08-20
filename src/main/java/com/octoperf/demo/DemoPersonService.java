package com.octoperf.demo;

import org.springframework.stereotype.Service;

import com.octoperf.Person;
import com.octoperf.PersonService;

@Service
final class DemoPersonService implements PersonService {

	@Override
	public Person johnSmith() {
		final Person person = new Person();
	    person.setFirstname("John");
	    person.setLastname("Smith");
	    return person;
	}

	@Override
	public String hello(Person person) {
		return "Hello " + person.getFirstname() + " " + person.getLastname() + "!";
	}

}
