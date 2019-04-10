package com.yang.com.yang.singleton.test;

import com.yang.singleton.lazy.LazyDublecheckSingleton;
import com.yang.singleton.lazy.LazySimpleSingleton;
import com.yang.singleton.lazy.LazyinnerClassSingleton;
import com.yang.singleton.threadLocal.ThreadLocalSingleton;

//不用线程池
public class ExextorThread implements Runnable{

    @Override
    public void run() {
//        LazyinnerClassSingleton singleton =LazyinnerClassSingleton.getInstance();
//        LazySimpleSingleton singleton =LazySimpleSingleton.getInstance();
//        LazyDublecheckSingleton singleton = LazyDublecheckSingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();

        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+singleton);

    }
}
