package com.github.sergeybrezhnev;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {


    @JmsListener(destination = "${queue}")
    public void consume(String message) {
        System.out.println("Received: " + message);
    }
}
