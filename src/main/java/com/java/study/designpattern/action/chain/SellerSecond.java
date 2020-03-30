package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className SellerSecond
 * @description TODO
 * @date 2020/3/18 22:16
 **/
public class SellerSecond extends AbstractSeller {
    public SellerSecond(double profit) {
        super(profit);
    }

    @Override
    protected boolean sellWell() {
        return RandomUtil.hasRemainder(RandomUtil.getRandom(), 5);
    }
}
