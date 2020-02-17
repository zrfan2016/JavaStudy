package com.java.study.designpattern.create.factory.cxgc;

/**
 * @author zrfan
 * @className FactoryTest
 * @description TODO
 * @date 2020/2/17 21:12
 **/
public class FactoryTest {

    public static void main(String[] args) {
        CarFactory bmw = new BMWFactory();
        CarFactory benz = new BenzCarFactory();

        System.out.println(bmw.createFamilyCar());

        System.out.println(benz.createSuv());

    }
}
