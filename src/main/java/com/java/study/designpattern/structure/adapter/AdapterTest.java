package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className AdapterTest
 * @description 充电器转换头例子/  狗抓老鼠 /  把一个类的接口变化成客户端所需要的接口
 * 不建议在设计时采用 将a转换成b
 * @date 2020/3/3 21:10
 **/
public class AdapterTest {

    public static void main(String[] args) {
        Iphone in = new InnerIphone();
        Iphone out = new OuterIphone();
        Charger inCharger = new InnerCharger();
        Charger outCharger = new OuterCharger();

        in.charge(inCharger);
        out.charge(outCharger);

        System.out.println("-------------------");

        in.charge(outCharger);

        System.out.println("-------------------");

        in.charge(new InnerChargerAdapter(new OuterCharger()));

    }
}
