package com.electrostock.backend.service.Impl;

import com.electrostock.backend.entity.Order;
import com.electrostock.backend.repository.OrderRepository;
import com.electrostock.backend.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository  orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long id){
        return orderRepository.findById(id)
                .orElseThrow( () -> new RuntimeException("Order Not Found"));
    }

    @Override
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
}
