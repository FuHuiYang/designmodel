package com.yang.factory.simpleFactory;

import com.yang.factory.DatabaseCourseImpl;
import com.yang.factory.ICourse;
import com.yang.factory.JavaCourseImpl;

public class CourseFactory {
        public  ICourse crete(String name){
            if("java".equals(name)){
                return new JavaCourseImpl();
            }
            if("dataBase".equals(name)){
                return new DatabaseCourseImpl();
            }
            return null;
        }
        public  ICourse crete1(String name){
        try {
            ICourse o = (ICourse)Class.forName(name).newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
        public  ICourse crete2(Class name){
            try {
                ICourse o = (ICourse)name.newInstance();
                return o;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
}
