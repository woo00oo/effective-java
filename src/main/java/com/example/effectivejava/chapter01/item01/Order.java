package com.example.effectivejava.chapter01.item01;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/*
    이름을 가질 수 있다.(동일한 시그니처의 생성자를 두개 가질 수 없다.)
 */
public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

//    public Order(boolean prime, Product product) {
//        this.prime = prime;
//        this.product = product;
//    }
//
//    public Order(boolean urgent, Product product) {
//        this.urgent = urgent;
//        this.product = product;
//    }

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }

        Map<OrderStatus, Order> enumMap = new EnumMap<>(OrderStatus.class);

        enumMap.put(OrderStatus.DELIVERED, order);

    }

}
