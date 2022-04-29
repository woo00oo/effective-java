package com.example.effectivejava.chapter01.item03;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    public static final Elvis INSTANCE = new Elvis();
    private static boolean created;

    private Elvis() {
        //리플렉션 방어 코드
        if (created) {
            throw new UnsupportedOperationException("can`t be created by constructor.");
        }
        created = true;
    }

    @Override
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I`m outta here!");
    }

    @Override
    public void sing() {
        System.out.println("I`ll have a blue~ Christmas without you~");
    }

    // 역직렬화 시 새로운 인스턴스가 아닌 재정의한 readResolve 메소드가 실행됨.
    private Object readResolve() {
        return INSTANCE;
    }

}
