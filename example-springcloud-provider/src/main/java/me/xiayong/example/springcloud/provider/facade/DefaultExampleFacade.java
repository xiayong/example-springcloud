package me.xiayong.example.springcloud.provider.facade;

import me.xiayong.example.springcloud.api.ExampleFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author YongXia.
 * @since 1.0
 */
@RestController
public class DefaultExampleFacade implements ExampleFacade {
    private Logger logger = LoggerFactory.getLogger(DefaultExampleFacade.class);

    @Override
    public String now() {
        logger.debug("receive request...");
        return "hi, it is " + DateFormat.getInstance().format(new Date()) + " now.";
    }
}
