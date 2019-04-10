package com.yang.factory.methodFactory;

import com.yang.factory.DatabaseCourseImpl;
import com.yang.factory.ICourse;

public class DatabaseFactory implements ICourseFactory {
    @Override
    public ICourse creat() {
        return new DatabaseCourseImpl();
    }
}
