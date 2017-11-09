package com.brianphiri.rmi_client;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderBean {

    public OrderBean(){}

    @Autowired
    private OrderService orderService;

    public void addItem(){
        orderService.createOrder("banana", 23);
        orderService.createOrder("Apple", 700);
        orderService.createOrder("Pear", 0);
    }

    public void getAllOrders(){
        List<Order> orders = orderService.getOrderList();
        System.out.println(orders);
    }

}
