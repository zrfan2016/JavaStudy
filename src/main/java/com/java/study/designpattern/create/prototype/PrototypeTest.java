package com.java.study.designpattern.create.prototype;

/**
 * @author zrfan
 * @className PrototypeTest
 * @description 深复制  浅复制
 * @date 2020/2/29 22:03
 **/
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address ad = new Address();
        ad.setCity("北京");
        ad.setDetail("XXXXXX");
        String name = "张三";
        int gender = 1;
        String phone = "13012345678";
        String stuNo = "001";
        Student t1 = Student.createStudent(name, gender, phone, stuNo);
        t1.setAddress(ad);
        Student t2 = t1.clone();

        System.out.println("t1:" + t1.toString());
        System.out.println("t2:" + t2.toString());
        ad.setCity("上海");
        name = "里斯";
        System.out.println("t1:" + t1.toString());
        System.out.println("t2:" + t2.toString());
    }
}
