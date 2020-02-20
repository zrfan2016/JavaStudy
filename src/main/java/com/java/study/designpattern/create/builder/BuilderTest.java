package com.java.study.designpattern.create.builder;

/**
 * @author zrfan
 * @className BuilderTest
 * @description TODO
 * @date 2020/2/20 21:32
 **/
public class BuilderTest {

    public static void main(String[] args) {
        Food food = new Food.Builder().name("food1").proteins(10).fats(20).carbohydrates(10).sugar(10).build();
        System.out.println(food);
    }

}
