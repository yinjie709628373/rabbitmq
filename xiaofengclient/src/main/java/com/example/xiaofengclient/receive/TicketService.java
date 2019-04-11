package com.example.xiaofengclient.receive;

import com.example.xiaofengclient.sendMsg.SendMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketService {
    private Logger log = LoggerFactory.getLogger(getClass());

    @RabbitListener(queues = "ticket.re")
    public void process(String idCard) {
        log.info("成功" + idCard);
        try {
        } catch (Exception e) {
            log.info("失败");
        }
    }
}
