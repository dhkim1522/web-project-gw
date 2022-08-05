package com.gateway.webprojectgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebProjectGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebProjectGatewayApplication.class, args);
    }

}
