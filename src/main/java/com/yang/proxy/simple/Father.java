package com.yang.proxy.simple;

public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }
    public void findLove(){
        System.out.println("代理人帮你找");
        this.son.findLove();
        System.out.println("知道被代理人的需求后寻找");
    }
}
