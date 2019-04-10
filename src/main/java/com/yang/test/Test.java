package com.yang.test;

public class Test {
    private   Test(){}
    private String a=null;
    public class Test1{
        private String a=null;
        public void soutp(){
            System.out.println("测试内部类");
        }
    }

    public static void main(String[] args) {
        Test t=new Test();
        Test1 test1 = t.new Test1();
        test1.soutp();
    }
}
