package com.java.study.designpattern.structure.bridge;

/**
 * @author zrfan
 * @className CounterfeitNewFactory
 * @description TODO
 * @date 2020/3/10 22:35
 **/
public class CounterfeitNewFactory extends ImproveWineFactory {
    public CounterfeitNewFactory(Wine wine) {
        super(wine);
    }

    @Override
    protected void sell() {
        System.out.println("销售" + getWine().getClass());
    }

    @Override
    public void sellWine() {
        System.out.println("假酒工厂开始---");
        super.sellWine();
        System.out.println("假酒工厂结束---");
    }
}
