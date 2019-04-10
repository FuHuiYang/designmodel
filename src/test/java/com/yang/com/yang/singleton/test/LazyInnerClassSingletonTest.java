package com.yang.com.yang.singleton.test;

import com.yang.singleton.lazy.LazyinnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
//            Class<?> clazz = Class.forName("com.yang.singleton.lazy.LazyinnerClassSingleton");
            Class   clazz= LazyinnerClassSingleton.class;
            //默认构造方法
            Constructor c =clazz.getDeclaredConstructor(null);
            //授权
            c.setAccessible(true);//强吻
            Object o = c.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
            Object o2 = LazyinnerClassSingleton.getInstance();
            System.out.println("正常流程");
        }
    }
}
