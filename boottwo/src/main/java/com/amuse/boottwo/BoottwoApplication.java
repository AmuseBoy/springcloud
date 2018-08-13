package com.amuse.boottwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BoottwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoottwoApplication.class, args);
    }
}
