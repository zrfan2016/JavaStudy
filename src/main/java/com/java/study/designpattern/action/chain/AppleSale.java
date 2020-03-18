package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className AppleSale
 * @description TODO
 * @date 2020/3/18 22:17
 **/
public class AppleSale {
    public static void main(String[] args) {
        AbstractSeller farmer = new Farmer(1);
        AbstractSeller first = new SellerFirst(2);
        AbstractSeller second = new SellerSecond(2);
        AbstractSeller market = new SuperMarket(3);

        farmer.setNext(first);
        first.setNext(second);
        second.setNext(market);

        double price = 3.0d;

        System.out.println(farmer.salePrice(price));


    }
}
