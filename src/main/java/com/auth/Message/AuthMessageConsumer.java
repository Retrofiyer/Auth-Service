package com.auth.Message;

import com.auth.Entities.UserMessage;
import com.auth.Service.AuthService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthMessageConsumer {
    @Autowired
    private AuthService authService;

    @RabbitListener(queues = "auth.response.queue")
    public void receiveAuthMessage(UserMessage userMessage) {
        authService.receiveAuthResponse(userMessage);
    }
}
