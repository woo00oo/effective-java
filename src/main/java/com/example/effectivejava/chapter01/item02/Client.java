package com.example.effectivejava.chapter01.item02;

import com.example.effectivejava.chapter01.item02.NyPizza.Size;

import static com.example.effectivejava.chapter01.item02.NyPizza.Size.*;
import static com.example.effectivejava.chapter01.item02.Pizza.Topping.*;

public class Client {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

    }
}
