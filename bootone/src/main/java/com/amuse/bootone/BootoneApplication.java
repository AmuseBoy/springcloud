package com.amuse.bootone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BootoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootoneApplication.class, args);
    }
}
