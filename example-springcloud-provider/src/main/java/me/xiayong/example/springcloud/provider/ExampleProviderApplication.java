package me.xiayong.example.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author YongXia.
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ExampleProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleProviderApplication.class, args);
    }
}
