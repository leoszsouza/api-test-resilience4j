package com.example.leoresilience;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "helloClient", url = "http://localhost:8085/v1/test")
public interface HelloClient {

    @GetMapping(value = "/hello")
    String getHello();
}
