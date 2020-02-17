package com.java.study.designpattern.create.factory.gxff;

/**
 * @author zrfan
 * @className BenzFactory
 * @description benz 汽车工厂
 * @date 2020/2/17 20:45
 **/
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return Car.createByBrand("Benz");
    }
}
