package com.example.effectivejava.chapter01.item08.autoclosable;

public class App {

    public static void main(String[] args) {

        try(AutoClosableIsGood good = new AutoClosableIsGood()) {
            // 자원 반납 처리가 됨.
        }
    }
}
