package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className InnerChargerAdapter
 * @description TODO
 * @date 2020/3/3 21:41
 **/
public class InnerChargerAdapter extends InnerCharger {

    private OuterCharger outerCharger;

    public InnerChargerAdapter(OuterCharger charger) {
        this.outerCharger = charger;
    }

    @Override
    public void charge() {
        System.out.println("增加转换头");
        outerCharger.charge();
    }
}
