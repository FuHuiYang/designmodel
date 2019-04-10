package com.yang.delegate;

public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A现在开始做领导分配的"+command+"工作");
    }
}
