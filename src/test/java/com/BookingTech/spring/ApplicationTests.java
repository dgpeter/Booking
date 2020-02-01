package com.BookingTech.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/spring-rest/foos";
		ResponseEntity<String> response
				= restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
	}

}
