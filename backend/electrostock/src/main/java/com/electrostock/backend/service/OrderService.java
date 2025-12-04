package com.electrostock.backend.service;

import com.electrostock.backend.entity.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrderById(Long id);
    List<Order> getAllOrders();
}

