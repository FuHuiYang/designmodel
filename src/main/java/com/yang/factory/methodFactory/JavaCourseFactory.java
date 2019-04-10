package com.yang.factory.methodFactory;

import com.yang.factory.ICourse;
import com.yang.factory.JavaCourseImpl;

public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse creat() {
        return new JavaCourseImpl();
    }
}
