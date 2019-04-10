package com.yang.test;

public class ClassInit {
    public static int k = 0;
    public static ClassInit t1 = new ClassInit("t1");
    public static ClassInit t2 = new ClassInit("t2");
    public static int i = print("i");
    public static int n = 99;

    public int j = print("j");

    {
        print("构造快");
    }

    static{
        print("静态块");
    }

    public ClassInit(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++n;
        ++i;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++i;
        return ++n;
    }

    public static void main(String[] args) {
        ClassInit t = new ClassInit("init");
    }

}