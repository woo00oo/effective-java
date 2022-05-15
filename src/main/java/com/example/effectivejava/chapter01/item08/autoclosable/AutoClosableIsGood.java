package com.example.effectivejava.chapter01.item08.autoclosable;

import java.io.*;

public class AutoClosableIsGood implements Closeable{

    private BufferedReader reader;

    public AutoClosableIsGood(String path) {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    /**
     * close 메소드는 멱등성을 유지 시켜야 함.
     */
    @Override
    public void close() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
