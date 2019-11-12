package com.offcn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@EnableEurekaClient
public class UserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }
@Autowired
private RestTemplate restTemplate;
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

   /* @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

}
