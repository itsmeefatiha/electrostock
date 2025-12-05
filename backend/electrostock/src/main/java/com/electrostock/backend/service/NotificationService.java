package com.electrostock.backend.service;

import com.electrostock.backend.dto.StockNotification;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final SimpMessagingTemplate messagingTemplate;
    private static final String DESTINATION = "/topic/stock-alerts";

    public NotificationService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void sendStockNotification(StockNotification payload) {
        messagingTemplate.convertAndSend(DESTINATION, payload);
    }
}
