package com.example.leoresilience;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({HelloController.class,
HelloService.class })
@Configuration
public class LeoResilienceContext {
}
