package com.example.effectivejava.chapter01.item03;

public class Elvis implements IElvis{

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    @Override
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I`m outta here!");
    }

    @Override
    public void sing() {
        System.out.println("I`ll have a blue~ Christmas without you~");
    }

}
