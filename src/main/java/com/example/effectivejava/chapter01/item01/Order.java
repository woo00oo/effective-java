package com.example.effectivejava.chapter01.item01;

/*
    이름을 가질 수 있다.(동일한 시그니처의 생성자를 두개 가질 수 없다.)
 */
public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

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

}
