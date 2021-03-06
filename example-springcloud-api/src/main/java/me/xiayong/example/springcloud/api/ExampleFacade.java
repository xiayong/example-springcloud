package me.xiayong.example.springcloud.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YongXia.
 * @since 1.0
 */
@FeignClient("${example.springcloud.service.name:example-springcloud-service}")
public interface ExampleFacade {

    @RequestMapping("now")
    String now();
}
