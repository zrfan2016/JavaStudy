package com.java.study.designpattern.action.templatemethod;

/**
 * @author zrfan
 * @className AbstractSkewered
 * @description TODO
 * @date 2020/3/24 21:48
 **/
public abstract class AbstractSkewered {

    private boolean needPeppery = false;

    protected abstract void prepareMeat();

    protected abstract void roast();

    protected abstract void addCondiment();

    protected boolean needPeppery() {
        return this.needPeppery;
    }

    protected abstract void addPeppery();

    public void cookSkewered() {
        prepareMeat();
        roast();
        addCondiment();
        if (needPeppery()) {
            addPeppery();
        }
    }


}
