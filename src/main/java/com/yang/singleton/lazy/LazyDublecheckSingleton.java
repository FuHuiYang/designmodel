package com.yang.singleton.lazy;

public class LazyDublecheckSingleton {
    private volatile static  LazyDublecheckSingleton lazy= null;
    private  LazyDublecheckSingleton(){}
    //适中的方案
    //双重检查锁线程不安全是因为2.3步可能在某些编译下回重排
    public  static LazyDublecheckSingleton getInstance(){
        if(lazy==null){
            synchronized (LazyDublecheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDublecheckSingleton();
                    //CPU执行时候会转换成JVM指令执行
                    //2.3 不知道哪个先后 重排指令问题 volatile
                    //1 分配内存给这个对象
                    //2初始化对象
                    //3将初始化好的对象和内存地址建立关联 赋值
                    //4用户初次访问
                }
            }
        }
        return  lazy;
    }
}
