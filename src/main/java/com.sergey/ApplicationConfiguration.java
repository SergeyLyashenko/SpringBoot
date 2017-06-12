package com.sergey;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan("com")
public class ApplicationConfiguration {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationConfiguration.class, args);
    }
}
