package me.xiayong.example.springcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ExampleEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleEurekaServerApplication.class, args);
    }
}