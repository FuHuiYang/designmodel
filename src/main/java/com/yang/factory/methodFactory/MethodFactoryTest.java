package com.yang.factory.methodFactory;

import com.yang.factory.ICourse;

public class MethodFactoryTest {

    public static void main(String[] args) {
        //创建一个工厂
        ICourseFactory factory=new JavaCourseFactory();
        //java课程创建对象
        ICourse javaCourse = factory.creat();
        //java课程实现读取
        javaCourse.read();
    }
}
