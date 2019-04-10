package com.yang.delegate;

public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B,现在开始做领导分配的"+command+"工作");
    }
}
