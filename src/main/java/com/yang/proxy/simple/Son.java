package com.yang.proxy.simple;

import com.yang.proxy.Person;

public class Son  implements Person {


    @Override
    public void findLove() {
        System.out.println("被代理的人需要一个门当户对的东西");
    }

    @Override
    public void work() {
        System.out.println("被代理的人需要帮忙做个工作");
    }
}
