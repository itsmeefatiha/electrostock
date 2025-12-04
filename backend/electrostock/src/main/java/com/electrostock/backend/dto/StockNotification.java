package com.electrostock.backend.dto;

import java.time.LocalDateTime;

public class StockNotification {

    private Long productId;
    private String productName;
    private int quantity;
    private String level; // e.g., "LOW", "OUT_OF_STOCK"
    private String message;
    private LocalDateTime timestamp = LocalDateTime.now();

    public StockNotification() {}

    public StockNotification(Long productId, String productName, int quantity, String level, String message) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.level = level;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    // getters & setters
    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}

