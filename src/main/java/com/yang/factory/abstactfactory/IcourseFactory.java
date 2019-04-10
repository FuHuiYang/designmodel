package com.yang.factory.abstactfactory;

import com.yang.factory.ICourse;

/**
 * 顶层接口
 */
//要求所有子工厂都实现这个工厂
//列入一个品牌
public interface IcourseFactory {
    INote createNote();
    ICourse createCourse();
    IVideo createVideo();
}
