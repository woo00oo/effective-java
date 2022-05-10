package com.example.effectivejava.chapter01.item07.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class WeakReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(strong);

        strong = null;

        System.gc(); //SoftReference 만 new Object를 참조하고 있기 때문에 GC의 대상이 됨
        Thread.sleep(3000);

        // 거의 없어진다.
        System.out.println(weakReference.get());
    }
}
