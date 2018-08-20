package com.octoperf;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.preemptive;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = { DemoApplication.class }, webEnvironment = RANDOM_PORT)
public class PersonControllerTest {
	@Value("${local.server.port}")
	  private int port;
	
	@Before
	  public void setUp() {
	    RestAssured.authentication = preemptive().basic("user", "b8d9b203-a342-41f2-b7e2-cfaded77e5be");
	  }

	  @Test
	  public void shouldSayHello() {
	    get("http://localhost:" + port + "/person/johnsmith")
	      .then()
	      .assertThat()
	      .statusCode(200)
	      .body("firstname", Matchers.equalTo("John"))
	      .and()
	      .body("lastname", Matchers.equalTo("Smith"));
	  }
}
