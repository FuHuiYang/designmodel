package com.yang.delegate;

public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("登录",new Leader());
    }
}
