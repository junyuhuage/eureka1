package com.offcn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class hystrixApplication {


    public static void main(String[] args) {
        SpringApplication.run(hystrixApplication.class, args);
    }
}
/*
* @SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class hystixApplication {
    public static void main(String[] args) {
        SpringApplication.run(hystixApplication.class, args);
    }
}*/