package com.java.study.designpattern.create.factory.gxff;

/**
 * @author zrfan
 * @className Car
 * @description 汽车实体类
 * @date 2020/2/17 20:38
 **/
public class Car {
    /**
     * 品牌
     */
    private String brand;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("This is a ").append(this.brand).append(" Car.");
        return sb.toString();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static Car createByBrand(String brand) {
        Car car = new Car();
        car.setBrand(brand);
        return car;
    }
}
