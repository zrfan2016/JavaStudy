package com.java.study.designpattern.structure.bridge;

/**
 * @author zrfan
 * @className MaoTaiFactory
 * @description TODO
 * @date 2020/3/10 22:28
 **/
public class MaoTaiFactory extends WineFactory {
    @Override
    protected void sell() {
        System.out.println("---- 销售茅台");
    }

    @Override
    protected void makeWine() {
        System.out.println("---- 酿造茅台");
    }
}
