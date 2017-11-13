package me.xiayong.example.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author YongXia.
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ExampleEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleEurekaApplication.class, args);
    }
}
