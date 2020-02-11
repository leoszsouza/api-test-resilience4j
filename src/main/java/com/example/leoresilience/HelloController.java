package com.example.leoresilience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
public class HelloController {

    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    @Autowired
    private HelloService helloService;

    @RequestMapping("/test-hello-api")
    public String testHelloResilience() {
        return circuitBreakerFactory.create("hello").run(
                helloService.getHello,
                throwable -> fallbackMethod.apply(throwable)
        );
    }

    Function<Throwable, String> fallbackMethod = throwable -> {
        System.out.println("Exception: " + throwable);
        return "fallback from Resilience";
    };


}
