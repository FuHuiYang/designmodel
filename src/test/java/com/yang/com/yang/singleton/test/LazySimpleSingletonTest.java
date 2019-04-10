package com.yang.com.yang.singleton.test;

import com.yang.singleton.lazy.LazySimpleSingleton;

public class LazySimpleSingletonTest {
    public static void main(String[] args) {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        Thread t1=new Thread(new ExextorThread());
        Thread t2=new Thread(new ExextorThread());
        t1.start();
        t2.start();
        System.out.println("执行完毕");

    }
}
