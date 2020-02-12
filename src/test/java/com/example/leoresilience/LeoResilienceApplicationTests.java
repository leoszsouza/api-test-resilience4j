package com.example.leoresilience;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {FeignConfiguration.class, CircuitBreakerConfiguration.class,  LeoResilienceContext.class })
public class LeoResilienceApplicationTests {

	@Autowired
	HelloController helloController;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testApiResilience() throws Exception {
//		for (int i=0; i<60; i++){
//			Thread.sleep(1000);
//			System.out.println(helloController.testHelloResilience());
//		}
	}

}
