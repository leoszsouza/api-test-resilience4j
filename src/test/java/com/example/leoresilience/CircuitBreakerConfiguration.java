package com.example.leoresilience;

import io.github.resilience4j.circuitbreaker.autoconfigure.CircuitBreakerAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@ImportAutoConfiguration({
        CircuitBreakerAutoConfiguration.class})
public class CircuitBreakerConfiguration{

}