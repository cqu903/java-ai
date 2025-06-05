package com.zerofinance.spring_ai_study.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    @Autowired
    private ChatModel chatModel;

    @Autowired
    private ChatClient chatClient;

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        return chatModel.call(message);
    }

    @GetMapping("/chat-ai")
    public String chatAi(@RequestParam String message) {
        return chatClient.prompt().user(message).call().content();
    }

    @GetMapping("/chat-ai-stream")
    public String chatAiStream(@RequestParam String message) {
        return chatClient.prompt().user(message).stream().call().content();
    }
}
