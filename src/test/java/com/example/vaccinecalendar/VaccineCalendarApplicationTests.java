package com.example.vaccinecalendar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class VaccineCalendarApplicationTests {

	@Test
	@DisplayName("Full application context loads properly")
	void contextLoads(ApplicationContext context) {
		assertNotNull(context);
	}

}
