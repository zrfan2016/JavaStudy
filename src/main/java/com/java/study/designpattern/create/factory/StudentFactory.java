package com.java.study.designpattern.create.factory;

/**
 * @author zrfan
 * @className StudentFactory
 * @description 简单工厂模式 不属于GoF 23种设计模式
 * 简单好用 扩展性差
 * @date 2020/2/15 22:30
 **/
public class StudentFactory {

    public static Student createStudent(String name, String gender, int age) {
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        stu.setGender(gender);
        return stu;
    }
}
