package me.xiayong.example.springcloud.eureka.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author YongXia.
 * @since 1.0
 */
@RestController
public class ExampleFacade {

    @RequestMapping("now")
    public String now() {
        return "Now is :" + DateFormat.getInstance().format(new Date()) + ".";
    }
}
