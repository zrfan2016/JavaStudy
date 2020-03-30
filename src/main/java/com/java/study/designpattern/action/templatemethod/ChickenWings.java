package com.java.study.designpattern.action.templatemethod;

/**
 * @author zrfan
 * @className ChickenWings
 * @description TODO
 * @date 2020/3/24 22:18
 **/
public class ChickenWings extends AbstractSkewered {
    @Override
    protected void prepareMeat() {
        System.out.println("批发市场买新鲜的鸡翅");
    }

    @Override
    protected void roast() {
        System.out.println("放在火上好好烤");
    }

    @Override
    protected void addCondiment() {
        System.out.println("刷点蜂蜜，放点孜然");
    }

    @Override
    protected void addPeppery() {
        System.out.println("加点辣");
    }
}
