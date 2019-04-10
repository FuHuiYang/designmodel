package com.yang.factory.abstactfactory;

public class AbstactFactoryTest {
    public static void main(String[] args) {
        IcourseFactory factory=new JavaCourseFactory();
        factory.createCourse().read();
        factory.createNote().readNote();
        factory.createVideo().readVideo();
        IcourseFactory databasefactory=new DatabaseFactory();
        databasefactory.createCourse().read();
        databasefactory.createNote().readNote();
        databasefactory.createVideo().readVideo();
    }
}
