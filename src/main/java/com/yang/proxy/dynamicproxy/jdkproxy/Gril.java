package com.yang.proxy.dynamicproxy.jdkproxy;

import com.yang.proxy.Person;

public class Gril implements Person {
    @Override
    public void findLove() {
        System.out.println("需要 有钱 ，有文化，有思想的人");
    }

    @Override
    public void work() {
        System.out.println("正常上班朝九晚五");
    }
}
