package com.java.study.designpattern.action.templatemethod;

/**
 * @author zrfan
 * @className Dishonest
 * @description TODO
 * @date 2020/3/24 22:02
 **/
public class DishonestTrader extends AbstractSkewered {
    @Override
    protected void prepareMeat() {
        System.out.println("羊肉里掺点其他的肉");
    }

    @Override
    protected void roast() {
        System.out.println("放在火上烤起来，烤的差不多了");
    }

    @Override
    protected void addCondiment() {
        System.out.println("加点孜然等调料");
    }

    @Override
    protected void addPeppery() {
        System.out.println("老板加点辣");
    }
}
