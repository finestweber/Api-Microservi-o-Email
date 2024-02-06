package com.ms.email.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

public class EmailConsumer {
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listEmailQueue(@Payload String string){
        System.out.println(string);
    }
}
