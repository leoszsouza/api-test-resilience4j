package com.example.leoresilience;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeoResilienceApplicationTests {

	@Autowired
	HelloController helloController;

	@Test
	void contextLoads() {
	}

	@Test
	public void testApiResilience() throws InterruptedException {
		for (int i=0; i<60; i++){
			Thread.sleep(1000);
			System.out.println(helloController.testHelloResilience());
		}
	}

}
