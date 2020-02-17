package com.java.study.designpattern.create.factory.cxgc;

/**
 * @author zrfan
 * @className BMWFactory
 * @description TODO
 * @date 2020/2/17 21:08
 **/
public class BMWFactory implements CarFactory {
    @Override
    public Car createFamilyCar() {
        Car car = createByBrand();
        car.setCarType("FamilyCar");
        return car;
    }

    @Override
    public Car createSuv() {
        Car car = createByBrand();
        car.setCarType("SUV");
        return car;
    }

    private Car createByBrand() {
        return Car.createByBrand("BMW");
    }

}
