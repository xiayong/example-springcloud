package me.xiayong.example.springcloud.consumer;

import me.xiayong.example.springcloud.api.ExampleFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author YongXia.
 * @since 1.0
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ExampleConsumerApplication.class)
public class ExampleConsumerTests {
    private ExampleFacade exampleFacade;

    public ExampleFacade getExampleFacade() {
        return exampleFacade;
    }

    @Autowired
    public void setExampleFacade(ExampleFacade exampleFacade) {
        this.exampleFacade = exampleFacade;
    }

    @Test
    public void test() {
        String now = exampleFacade.now();
        Assertions.assertNotNull(now);
    }
}
