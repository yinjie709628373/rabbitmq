package com.example.xiaofeng.sendMsg;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendMessage {
    @Autowired
    private AmqpTemplate amqpTemplate;
    public void sendMsg(String msg){
        try {
        amqpTemplate.convertAndSend("ticket_exchange.re","key_ticket.re",msg);
      }catch (Exception e){
            e.printStackTrace();
        }

    }
}
