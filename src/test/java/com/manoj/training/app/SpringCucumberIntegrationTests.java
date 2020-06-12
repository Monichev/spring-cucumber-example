package com.manoj.training.app;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class SpringCucumberIntegrationTests {

	private final String SERVER_URL = "http://localhost";
	private final String THINGS_ENDPOINT = "/things";

	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	protected int port;

	private String thingsEndpoint() {
		return SERVER_URL + ":" + port + THINGS_ENDPOINT;
	}

	int put(String something) {
		return restTemplate.postForEntity(thingsEndpoint(), something, Void.class).getStatusCodeValue();
	}

	Bag getContents() {
		return restTemplate.getForEntity(thingsEndpoint(), Bag.class).getBody();
	}

	void clean() {
		restTemplate.delete(thingsEndpoint());
	}

}
