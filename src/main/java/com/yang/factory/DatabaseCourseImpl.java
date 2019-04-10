package com.yang.factory;

public class DatabaseCourseImpl implements ICourse {

    public void create() {
        System.out.println("大数据实现");
    }

    @Override
    public void read() {
        System.out.println("正在读取大数据课程");
    }
}
