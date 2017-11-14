package me.xiayong.example.springcloud.consumer;

import me.xiayong.example.springcloud.api.ExampleFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author YongXia.
 * @since 1.0
 */
@RunWith(SpringRunner.class)
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
        Assert.assertNotNull(now);
    }
}
