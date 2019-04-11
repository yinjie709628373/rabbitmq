package com.example.xiaofeng.sendMsg;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {
    @Bean(name = "message")
    public Queue queueMessage() {
        //创建队列  可配置
        return new Queue("ticket.re");
    }

    /**
     * 创建交换器
     *
     * @return
     */
    @Bean(name = "exchange")
    public TopicExchange exchange() {
        return new TopicExchange("ticket_exchange.re");
    }
@Bean
    Binding bindingExchangeMessage(@Qualifier("message") Queue queue, @Qualifier("exchange") TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("key_ticket.re");
    }
}
