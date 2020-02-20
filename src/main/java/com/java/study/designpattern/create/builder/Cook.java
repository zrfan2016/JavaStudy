package com.java.study.designpattern.create.builder;

import org.apache.commons.lang3.ObjectUtils;

import java.util.List;

/**
 * @author zrfan
 * @className Cook
 * @description 烹饪，做饭
 * @date 2020/2/20 21:40
 **/
public abstract class Cook {

    private List<String> steps;

    protected abstract void putOil();

    protected abstract void putSalt();

    protected abstract void putVinegar();

    protected abstract void putSoySauce();

    protected abstract void putWater();

    public final void cook() {
//        if (CollectionUtils.isNotEmpty(steps)) {
        if (ObjectUtils.isNotEmpty(steps)) {
            for (String str : steps) {
                switch (str) {
                    case "Oil":
                        putOil();
                        break;
                    case "Salt":
                        putSalt();
                        break;
                    case "Vinegar":
                        putVinegar();
                        break;
                    case "SoySauce":
                        putSoySauce();
                        break;
                    case "Water":
                        putWater();
                    default:
                }
            }
            System.out.println("cooking-----");
        }
        System.out.println("cook food end ,let's eat");
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

}
