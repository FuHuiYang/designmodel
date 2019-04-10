package com.yang.singleton.hungry;

/**
 * 饿汉式
 * 缺点：浪费内存空间
 */
public class HungryStaticSingleton {
    //final 不加 可能会通过 反射机制调用改变
    private static  final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton =new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){};

    public  static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }
}
