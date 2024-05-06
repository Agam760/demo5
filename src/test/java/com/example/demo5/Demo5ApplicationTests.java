package com.example.demo5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo5ApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(Demo5ApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Application executed.......");
		assertEquals(true, true);
		}

}
