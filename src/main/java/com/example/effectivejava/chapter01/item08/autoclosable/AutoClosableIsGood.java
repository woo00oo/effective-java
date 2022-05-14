package com.example.effectivejava.chapter01.item08.autoclosable;

import java.io.*;

public class AutoClosableIsGood implements AutoCloseable{

    private BufferedInputStream inputStream;

    @Override
    public void close() {
        try {
            System.out.println("안녕~");
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
