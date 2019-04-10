package com.yang.factory.simpleFactory;

import com.yang.factory.ICourse;
import com.yang.factory.JavaCourseImpl;

public class SimpleFactoryTest {
    /**
     * 简单工厂模式不符合开闭原则
     * 如果添加或修改实现类 那工厂就的添加if判断不符合这个原则
     * @param args
     */
    public static void main(String[] args) {
        //原先是这样 需要什么new什么
//        ICourse course =new JavaCourseImpl();
        //简单工行模式初版 会出现空指针
//        JavaFactory factory=new CourseFactory();
//        ICourse course = factory.crete("java1");
        //优化版反射
//        JavaFactory factory=new CourseFactory();
//        ICourse course = factory.crete1("com.yang.factory.JavaCourseImpl");
        //继续优化
        CourseFactory factory=new CourseFactory();
         ICourse course = factory.crete2(JavaCourseImpl.class);
         course.read();

    }
}
