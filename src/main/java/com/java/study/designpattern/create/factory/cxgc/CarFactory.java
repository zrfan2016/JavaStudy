package com.java.study.designpattern.create.factory.cxgc;

/**
 * @author zrfan
 * @className CarFactory
 * @description TODO
 * @date 2020/2/17 20:58
 **/
public interface CarFactory {

    /**
     * 建造一辆家用轿车
     *
     * @return
     */
    Car createFamilyCar();

    /**
     * 建造一辆SUV
     *
     * @return
     */
    Car createSuv();

}
