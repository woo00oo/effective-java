package com.example.effectivejava.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {

    private static final Pattern SPLIT_PATTERN = Pattern.compile(",");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            String name = "keesun,whiteship";
            SPLIT_PATTERN.split(name);
        }
        System.out.println(System.nanoTime() - start);
    }
}
