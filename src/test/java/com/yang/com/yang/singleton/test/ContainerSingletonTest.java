package com.yang.com.yang.singleton.test;

import com.yang.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        try{
        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            @Override
            public void handler() {
                Object o = ContainerSingleton.getbean("com.yang.com.yang.singleton.test.Pojo");
                System.out.println(System.currentTimeMillis()+":"+o);
            }
        },10,5);
        }catch (Exception e){
            System.out.println("并发异常");
        }
    }
}
