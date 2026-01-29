package com.spring.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = "dev")
class AppTestSpringSecApplicationTests {

	@Test
	void contextLoads() {
	}

}
