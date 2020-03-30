package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className Farmer
 * @description TODO
 * @date 2020/3/18 22:11
 **/
public class Farmer extends AbstractSeller {
    public Farmer(double profit) {
        super(profit);
    }

    @Override
    protected boolean sellWell() {
        return RandomUtil.hasRemainder(RandomUtil.getRandom(), 2);
    }
}
