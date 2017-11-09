package com.brianphiri.rmi_client;

public class Order {
    private String item;
    private int qty;

    public Order() {
    }

    public Order(String item, int qty) {
        this.item = item;
        this.qty = qty;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Sever.Order{" +
                "item='" + item + '\'' +
                ", qty=" + qty +
                '}';
    }
}
