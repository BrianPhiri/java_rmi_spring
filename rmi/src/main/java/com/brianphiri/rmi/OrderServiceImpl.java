package com.brianphiri.rmi;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private List<Order> orders = new ArrayList<Order>();

    @Override
    public void createOrder(String item, int qty) {
        System.out.print("Item : "+item+" Qty : "+qty);
        Order order = new Order();
        order.setItem(item);
        order.setQty(qty);
        orders.add(order);
    }

    @Override
    public List<Order> getOrderList() {
        return new ArrayList<>(orders);
    }
}
