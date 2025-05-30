package com.github.sergeybrezhnev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    private final JmsTemplate jmsTemplate;
    private final String queue;

    public Producer(JmsTemplate jmsTemplate, @Value("${queue}") String queue) {
        this.jmsTemplate = jmsTemplate;
        this.queue = queue;
        this.produce();
    }

    public void produce() {
        jmsTemplate.send(queue, session -> session.createTextMessage("Hello, Artemis!"));
    }
}
