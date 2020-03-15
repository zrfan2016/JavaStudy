package com.java.study.designpattern.structure.decorator;

/**
 * @author zrfan
 * @className RiceCooker
 * @description TODO
 * @date 2020/3/15 21:00
 **/
public class RiceCooker implements CookService {

    @Override
    public void doCook(int costTime) {
        System.out.println("start cook");
        System.out.println("cook " + costTime + " time");
        System.out.println("end cook");
    }

}
