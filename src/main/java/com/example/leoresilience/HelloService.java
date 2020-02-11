package com.example.leoresilience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.function.Supplier;


@Service
public class HelloService {

    @Autowired
    private HelloClient helloClient;

    Supplier<String> getHello = () -> helloClient.getHello();

}
