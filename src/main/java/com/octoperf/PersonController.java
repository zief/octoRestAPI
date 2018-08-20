package com.octoperf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@GetMapping("/hello")
	  public Person hello() {
	    final Person person = new Person();
	    person.setFirstname("John");
	    person.setLastname("Smith");
	    return person;
	  }
	
	@PostMapping("/hello")
	public String postHello(@RequestBody final Person person) {
	  return "Hello " + person.getFirstname() + " " + person.getLastname() + "!";
	}

}
