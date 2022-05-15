package com.example.effectivejava.chapter01.item09.suppress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {
    // 코드 9-1 try-finally - 더 이상 자원을 회수하는 최선의 방책이 아니다! (47쪽)
    static String firstLineOfFile(String path) throws IOException {
        try(BufferedReader br = new BadBufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile("pom.xml"));
    }
}

/**
 * try-finally 구문일 경우에는 CharConversionException이 스택 트레이스에 보이지 않지만,
 * try-with-resource 구문일 경우에는 최초 발생한 CharConversionException 과 Suppressed인 StreamCorruptedException 둘 다 스택 트레이스에 보여진다.
 */