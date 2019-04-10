package com.yang.factory.abstactfactory;

import com.yang.factory.DatabaseCourseImpl;
import com.yang.factory.ICourse;

public class DatabaseFactory implements IcourseFactory {
    @Override
    public INote createNote() {
        return new INote() {
            @Override
            public void readNote() {
                System.out.println("正在读取database笔记");
            }
        };
    }

    @Override
    public ICourse createCourse() {
        return new DatabaseCourseImpl();
    }

    @Override
    public IVideo createVideo() {
        return new IVideo() {
            public void readVideo() {
                System.out.println("正在读取databaseVideo");
            }
        };
    }
}
