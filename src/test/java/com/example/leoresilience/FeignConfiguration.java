package com.example.leoresilience;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(clients = {HelloClient.class})
@ImportAutoConfiguration({
        FeignAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class})
public class FeignConfiguration {
}