package com.example.rabbitmqdemo.Msg;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RabbitListener(queues = "QUEUE_A")
public class MsgReceiver {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process( Channel channel, String message, @Header(AmqpHeaders.DELIVERY_TAG) long tag) {

        System.out.println("消费了开始了");
        if(message==null){
            System.out.println("拉闸");
        }
        //TODO 处理队列
        logger.info("接收处理队列A当中的消息： " + message);
//        try {
//            channel.basicAck(tag,false);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
