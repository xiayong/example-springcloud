package me.xiayong.example.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YongXia.
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ExampleProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleProviderApplication.class, args);
    }
}
