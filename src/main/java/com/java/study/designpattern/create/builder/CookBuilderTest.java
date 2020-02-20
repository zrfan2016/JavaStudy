package com.java.study.designpattern.create.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zrfan
 * @className CookBuilderTest
 * @description TODO
 * @date 2020/2/20 22:01
 **/
public class CookBuilderTest {

    public static void main(String[] args) {
        CookTomatoAndEggBuilder builder1 = new CookTomatoAndEggBuilder();
        List<String> step1 = new ArrayList<>();
        step1.add("Oil");
        step1.add("Salt");
        step1.add("SoySauce");
        builder1.setSteps(step1);
        builder1.cook();

        CookBraisedPortBuilder builder2 = new CookBraisedPortBuilder();
        List<String> step2 = new ArrayList<>();
        step2.add("Oil");
        step2.add("Salt");
        step2.add("Vinegar");
        step2.add("SoySauce");
        step2.add("Water");
        builder2.setSteps(step2);
        builder2.cook();
    }

}
