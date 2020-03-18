package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className SuperMarket
 * @description TODO
 * @date 2020/3/18 22:17
 **/
public class SuperMarket extends AbstractSeller {
    public SuperMarket(double profit) {
        super(profit);
    }

    @Override
    protected boolean sellWell() {
        return RandomUtil.hasRemainder(RandomUtil.getRandom(), 7);
    }
}
