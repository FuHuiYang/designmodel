package com.yang.singleton.threadLocal;

public class ThreadLocalSingleton {
    //使用ThreadLocal 用来多数据源
    private ThreadLocalSingleton(){}
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return  threadLocalInstance.get();
    }
}
