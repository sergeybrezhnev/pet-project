package com.github.sergeybrezhnev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducerService {

    private final JmsTemplate jmsTemplate;
    private final String queue;

    public MessageProducerService(JmsTemplate jmsTemplate, @Value("${queue}") String queue) {
        this.jmsTemplate = jmsTemplate;
        this.queue = queue;
    }

    public void produce(String message) {
        jmsTemplate.send(queue, session -> session.createTextMessage(message));
    }
}
