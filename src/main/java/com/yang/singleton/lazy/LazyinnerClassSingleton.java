package com.yang.singleton.lazy;

public class LazyinnerClassSingleton {
    //虽然构造方法私有了都会但是会被反射攻击
    private LazyinnerClassSingleton(){
        System.out.println("进入私有构造");
        //防反射
        if(lazyHolder.LAZY!=null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }
    //静态内部类的实现方式 性能最优的写法
    //没有用到synchronize关键字
    //利用内部类的特性 JVM底层执行逻辑，完美地避免了线程安全问题
    public static  LazyinnerClassSingleton getInstance(){
        return lazyHolder.LAZY;
    }


    private  static class lazyHolder{

        private static  LazyinnerClassSingleton LAZY=new LazyinnerClassSingleton();
    }
}
