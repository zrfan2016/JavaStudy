package com.java.study.designpattern.structure.bridge;

/**
 * @author zrfan
 * @className Test
 * @description TODO
 * @date 2020/3/10 22:40
 **/
public class Test {

    public static void main(String[] args) {

        Wine maoTai = new MaoTai();
        Wine erGuoTou = new ErGuoTou();
        ImproveWineFactory ctfeitFactory = new CounterfeitNewFactory(maoTai);
        ctfeitFactory.sellWine();

        ctfeitFactory.setWine(erGuoTou);
        ctfeitFactory.sellWine();

    }

}
