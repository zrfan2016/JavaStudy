package com.java.study.designpattern.create.factory.cxgc;

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

    /**
     * 类型
     */
    private String carType;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("This is a ").append(this.brand).append(" ").append(this.carType).append(" Car.");
        return sb.toString();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public static Car createByBrand(String brand) {
        Car car = new Car();
        car.setBrand(brand);
        return car;
    }
}
