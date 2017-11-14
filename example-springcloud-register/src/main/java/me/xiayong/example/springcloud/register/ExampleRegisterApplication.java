package me.xiayong.example.springcloud.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ExampleRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleRegisterApplication.class, args);
    }
}