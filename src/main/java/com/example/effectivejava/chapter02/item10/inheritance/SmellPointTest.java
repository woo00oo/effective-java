package com.example.effectivejava.chapter02.item10.inheritance;

import com.example.effectivejava.chapter02.item10.Color;

public class SmellPointTest {
    public static void main(String[] args) {
        SmellPoint p1 = new SmellPoint(1, 0, "sweat");
        ColorPoint p2 = new ColorPoint(1, 0, Color.BLUE);
        p1.equals(p2); //stackOverFlow 발생
    }
}

/**
 * 스택(Stack)
 * 메소드 호출시, 스택에 스택 프레임이 쌓인다.(LIFO)
 * - 스택 프레임에 들어있는 정보 : 메소드에 전달하는 매개 변수, 메소드 실행 끝나고 돌아갈 곳, 힙에 들어있는 객체에 대한 레퍼런스
 *
 * 힙(Heap)
 * 실제 객체가 저장되는 메모리
 * GC가 처리되는 곳
 */