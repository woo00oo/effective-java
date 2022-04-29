package com.example.effectivejava.chapter01.item03;

import java.lang.reflect.Constructor;

public class ElvisReflection {

    public static void main(String[] args) {
        try {
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            Elvis elvis1 = defaultConstructor.newInstance();
            Elvis elvis2 = defaultConstructor.newInstance();
            System.out.println(elvis1==elvis2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
