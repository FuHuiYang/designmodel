package com.yang.com.yang.singleton.test;

import com.yang.singleton.threadLocal.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        Thread t1=new Thread(new ExextorThread());
        Thread t2=new Thread(new ExextorThread());
        t1.start();
        t2.start();

    }
}
