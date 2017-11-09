package com.brianphiri.rmi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    public void createOrder(String item, int qty);

    List<Order> getOrderList();
}
