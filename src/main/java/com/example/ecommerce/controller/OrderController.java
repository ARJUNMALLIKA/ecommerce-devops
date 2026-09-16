package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/api/orders")
    public String getOrders() {
        return "Order API is running successfully";
    }

    @GetMapping("/api/health")
    public String health() {
        return "UP";
    }
}
