package com.layman.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestCustomer
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/8 14:55
 * @Version 3.0
 **/
@Component
@RabbitListener(queues = "cpw_customer_netty")
public class TestCustomer {

    @RabbitHandler
    public void showMessage (String message) {
        System.out.println(message);
    }
}
