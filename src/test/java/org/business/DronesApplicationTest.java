package org.business;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import org.business.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
public class DronesApplicationTest {

	@Autowired
	private Controller controller;

	@Test
	public void contextLoad() {
		assertThat(controller).isNotNull();
		
	}

}