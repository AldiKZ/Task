package com.test.Task.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;

@org.springframework.stereotype.Controller
public class Controller {

    @MessageMapping("/chat")
    public String handleMChat(@Payload String mess){
        return mess;
    }
}
