package com.example.effectivejava.chapter01.item07.reference;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> softReference = new SoftReference<>(strong);

        strong = null;

        System.gc(); //SoftReference 만 new Object를 참조하고 있기 때문에 GC의 대상이 됨
        Thread.sleep(3000);

        // 하지만 거의 안 없어진다.
        // 메모리 공간이 부족할 경우 GC (메모리 공간이 충분하다)
        System.out.println(softReference.get());
    }
}
