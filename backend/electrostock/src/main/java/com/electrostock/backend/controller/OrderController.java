package com.electrostock.backend.controller;


import com.electrostock.backend.entity.Order;
import com.electrostock.backend.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {

    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order CreateOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }


    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable long id){
        return orderService.getOrderById(id);
    }



}
