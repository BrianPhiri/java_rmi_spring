package com.brianphiri.rmi_client;

import java.util.List;

public interface OrderService {
    public void createOrder(String item, int qty);

    List<Order> getOrderList();
}
