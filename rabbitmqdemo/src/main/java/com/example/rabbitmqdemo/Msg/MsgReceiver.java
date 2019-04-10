package com.example.rabbitmqdemo.Msg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "QUEUE_A")
public class MsgReceiver {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String content) {

        System.out.println("消费了开始了");
        if(content==null){
            System.out.println("拉闸");
        }
        //TODO 处理队列
        logger.info("接收处理队列A当中的消息： " + content);
    }
}
