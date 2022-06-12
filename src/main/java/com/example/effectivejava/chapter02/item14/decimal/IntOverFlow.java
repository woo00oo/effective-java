package com.example.effectivejava.chapter02.item14.decimal;

public class IntOverFlow {

    public static void main(String[] args) {
        System.out.println(-2147483648 - 10); // 양수 출력

        System.out.println(Integer.compare(-2147483648, -10));
    }
}
