package example.websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
public class WebSocketController {
	@Autowired
    private SimpMessagingTemplate messagingTemplate;

	@MessageMapping("/broadcast")
	@SendTo("/topic/getMessage")
	public String broadcast(String message) {
		return message;
	}
}
