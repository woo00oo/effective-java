package com.example.effectivejava.chapter01.item03;

public class Car {
    private String message;

    public Car(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(this.message);
    }
}
