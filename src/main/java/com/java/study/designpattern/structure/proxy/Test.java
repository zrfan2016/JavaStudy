package com.java.study.designpattern.structure.proxy;

/**
 * @author zrfan
 * @className Test
 * @description TODO
 * @date 2020/3/16 21:49
 **/
public class Test {

    public static void main(String[] args) {

        IStar starA = new StarA();
        IStar starB = new StarB();
        IStar starC = new StarC();
        StarProxy proxy = new StarProxy(null);

        proxy.act();
        proxy.sing();
        proxy.dance();

        proxy = new StarProxy(starA);
        proxy.act();

        proxy = new StarProxy(starB);
        proxy.dance();

        proxy = new StarProxy(starC);
        proxy.sing();


    }
}
