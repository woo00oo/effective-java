package com.example.effectivejava.chapter02.item10.record;

public class PointTest {
    public static void main(String[] args) {

    }
}

/**
 * 자바 JDK 17 이후 부터 레코드를 사용할 수 있음(VO)
 *
 * equals, toString, hashcode를 따로 정의하지 않아도 자바가 컴파일 시점에 자동으로 생성해줌.
 * public record Point(int x, int y) {
 *
 * }
 */