package com.example.xiaofengclient.sendMsg;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendMessage {
    @Autowired
    private AmqpTemplate amqpTemplate;
    public void sendMsg(String msg){
        try {
        amqpTemplate.convertAndSend("ticket_exchange","key_ticket",msg);
      }catch (Exception e){
            e.printStackTrace();
        }

    }
}
