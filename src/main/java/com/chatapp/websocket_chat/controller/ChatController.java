package com.chatapp.websocket_chat.controller;

import com.chatapp.websocket_chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {











    // Message received here
    @MessageMapping("/send")

    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        System.out.println("Message received: " + chatMessage.getContent());
        return chatMessage;
    }

}
