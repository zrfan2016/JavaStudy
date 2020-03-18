package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className SellerFirst
 * @description TODO
 * @date 2020/3/18 22:16
 **/
public class SellerFirst extends AbstractSeller {
    public SellerFirst(double profit) {
        super(profit);
    }

    @Override
    protected boolean sellWell() {
        return RandomUtil.hasRemainder(RandomUtil.getRandom(), 3);
    }
}
