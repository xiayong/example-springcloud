package me.xiayong.example.springcloud.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YongXia.
 * @since 1.0
 */
@FeignClient("example-springcloud")
public interface ExampleFacade {

    @RequestMapping("now")
    String now();
}
