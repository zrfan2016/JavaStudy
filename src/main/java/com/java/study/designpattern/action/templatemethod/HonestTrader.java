package com.java.study.designpattern.action.templatemethod;

/**
 * @author zrfan
 * @className HonestTrader
 * @description TODO
 * @date 2020/3/24 22:15
 **/
public class HonestTrader extends AbstractSkewered {
    @Override
    protected void prepareMeat() {
        System.out.println("货真价实的新鲜羊肉");
    }

    @Override
    protected void roast() {
        System.out.println("用炭火好好的烤");
    }

    @Override
    protected void addCondiment() {
        System.out.println("加点秘制的调料");
    }

    @Override
    protected void addPeppery() {
        System.out.println("上等的辣椒面");
    }
}
