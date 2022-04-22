package com.example.effectivejava.chapter01.item01;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderStatus {

    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

    private int number;

    public int getNumber(OrderStatus orderStatus){
        return orderStatus.number;
    }

}
