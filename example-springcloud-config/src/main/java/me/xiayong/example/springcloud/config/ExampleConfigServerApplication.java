package me.xiayong.example.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author YongXia.
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ExampleConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleConfigServerApplication.class, args);
    }
}
