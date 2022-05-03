package com.example.effectivejava.chapter01.item04;

public abstract class UtilityClass {

    private static String hello() {
        return "hello";
    }

//    public UtilityClass() {
//        System.out.println("Constructor");
//    }

    /**
     * 이 클래스는 인스턴스를 만들 수 없다.
     */
    private UtilityClass() {
        throw new AssertionError();
    }

    public static void main(String[] args) {

    }
}
