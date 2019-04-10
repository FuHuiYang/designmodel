package com.yang.factory.abstactfactory;

import com.yang.factory.ICourse;
import com.yang.factory.JavaCourseImpl;

public class JavaCourseFactory implements IcourseFactory{
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public ICourse createCourse() {
        return new JavaCourseImpl();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
