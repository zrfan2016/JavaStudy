package com.java.study.designpattern.create.factory.gxff;

/**
 * @author zrfan
 * @className FactoryTest
 * @description 工厂方法 实现推迟到子类
 * @date 2020/2/17 20:46
 **/
public class FactoryTest {
    public static void main(String[] args) {
        CarFactory bmw = new BMWFactory();
        CarFactory benz = new BenzFactory();
        System.out.println(bmw.createCar());
        System.out.println(benz.createCar());
    }
}
