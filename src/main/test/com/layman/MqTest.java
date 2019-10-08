package com.layman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName MqTest
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/8 14:51
 * @Version 3.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqDemoApplication.class)
public class MqTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSend() {
        rabbitTemplate.convertAndSend("cpw_customer_netty", "send");
    }

}
