package com.octoperf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

import java.beans.ConstructorProperties;


@RestController
@RequestMapping("/person")
@AllArgsConstructor(access = PACKAGE )
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class PersonController {
	@NonNull
	PersonService persons;
	
	@GetMapping("/johnsmith")
	  public Person hello() {
	       return persons.johnSmith();
	  }
	
	@PostMapping("/hello")
	public String postHello(@RequestBody final Person person) {
	  return persons.hello(person);
	}
	

	@ConstructorProperties({"persons"})
	PersonController(@NonNull PersonService persons) {
		if (persons == null) {
			throw new NullPointerException("persons");
		} else {
			this.persons = persons;
		}
	}

	
	
}
