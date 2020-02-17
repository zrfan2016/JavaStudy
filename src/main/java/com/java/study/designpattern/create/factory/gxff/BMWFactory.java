package com.java.study.designpattern.create.factory.gxff;

/**
 * @author zrfan
 * @className BMWFactory
 * @description BMW 汽车工厂
 * @date 2020/2/17 20:41
 **/
public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return Car.createByBrand("BMW");
    }
}
