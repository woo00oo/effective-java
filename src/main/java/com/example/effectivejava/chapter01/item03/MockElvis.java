package com.example.effectivejava.chapter01.item03;

public class MockElvis implements IElvis{
    @Override
    public void leaveTheBuilding() {

    }

    @Override
    public void sing() {
        System.out.println("You ain`t nothin` but a hound dog.");
    }
}
