package com.yang.pattern;

public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("Java架构师");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();
        System.out.println("大数据");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();

    }
}
