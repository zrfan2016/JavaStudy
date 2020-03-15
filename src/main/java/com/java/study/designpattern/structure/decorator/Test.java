package com.java.study.designpattern.structure.decorator;

/**
 * @author zrfan
 * @className Test
 * @description TODO
 * @date 2020/3/15 21:13
 **/
public class Test {

    public static void main(String[] args) {
        CookService cooker = new RiceCooker();
        cooker = new TimerDecorator(cooker);
        cooker = new BrandDecorator(cooker);

        cooker.doCook(10);

    }
}
