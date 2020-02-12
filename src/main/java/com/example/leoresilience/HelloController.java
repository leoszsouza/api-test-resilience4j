package com.example.leoresilience;

import feign.FeignException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;


    @CircuitBreaker(name = "hello", fallbackMethod = "fallback")
    @RequestMapping("/test-hello-api")
    public String testHelloResilience() {
        return helloService.getHello.get();
    }

    private String fallback (RuntimeException e) {
        System.out.println("Exception: " + e);
        return "fallback from Resilience";
    };

    private String fallback (FeignException e) {
        System.out.println("FeignException: " + e);
        return "fallback from FeignException";
    };

}
