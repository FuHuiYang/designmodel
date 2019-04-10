package com.yang.singleton.lazy;

public class LazySimpleSingleton {
    private  static  LazySimpleSingleton lazy= null;
    private  LazySimpleSingleton(){
        System.out.println("进入LazySimpleSingleton私有构造方法里");
    }
    //jdk1.6之后对synchronized 性能优化了不少
    //不可避免的还是存在了一定的性能的问题
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy==null){
            lazy=new LazySimpleSingleton();
        }
        return  lazy;
    }
}
