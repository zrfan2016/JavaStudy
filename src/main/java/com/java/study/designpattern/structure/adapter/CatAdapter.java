package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className CatAdapter
 * @description TODO
 * @date 2020/3/3 21:57
 **/
public class CatAdapter implements ICat {

    private IDog dog;

    public CatAdapter(IDog dog) {
        this.dog = dog;
    }

    @Override
    public void catchMouse() {
        dog.protectHome();
        System.out.println("dog " + dog + " 还抓到了老鼠");
    }
}
