package com.java.study.designpattern.structure.bridge;

/**
 * @author zrfan
 * @className ImproveWineFactory
 * @description TODO
 * @date 2020/3/10 22:32
 **/
public abstract class ImproveWineFactory {

    private Wine wine;

    public ImproveWineFactory(Wine wine) {
        this.wine = wine;
    }

    public void sellWine() {
        makeWine();
        sell();
    }

    protected abstract void sell();

    protected void makeWine() {
        wine.beMake();
    }

    public Wine getWine() {
        return wine;
    }


    public void setWine(Wine wine) {
        this.wine = wine;
    }
}
