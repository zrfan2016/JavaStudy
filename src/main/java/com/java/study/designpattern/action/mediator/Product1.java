package com.java.study.designpattern.action.mediator;

/**
 * @author zrfan 19042901
 * @date 2020/5/10 21:44
 * @description TODO
 */
public class Product1 implements ProductService {

    @Override
    public int change2Money(int quantity) {
        return quantity * 2;
    }

    @Override
    public int getByMoney(int money) {
        return money / 2;
    }

}
