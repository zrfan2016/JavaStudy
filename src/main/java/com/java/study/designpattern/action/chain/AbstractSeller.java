package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className AbstractSeller
 * @description TODO
 * @date 2020/3/18 22:05
 **/
public abstract class AbstractSeller {

    private double profit;
    private AbstractSeller next;

    public AbstractSeller(double profit) {
        this.profit = profit;
    }


    public double salePrice(double cost) {
        double current = getPrice(cost);
        System.out.println(getClass().getSimpleName() + ":" + current);
        if (next == null) {
            return current;
        } else {
            return next.salePrice(current);
        }
    }

    protected double getPrice(double cost) {
        if (sellWell()) {
            return cost + profit;
        } else {
            return cost;
        }
    }

    protected abstract boolean sellWell();

    public void setNext(AbstractSeller next) {
        this.next = next;
    }
}
