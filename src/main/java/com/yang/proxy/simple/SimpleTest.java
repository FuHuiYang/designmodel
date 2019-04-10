package com.yang.proxy.simple;

public class SimpleTest {

    public static void main(String[] args) {
        Father father=new Father(new Son());
        father.findLove();
    }
}
