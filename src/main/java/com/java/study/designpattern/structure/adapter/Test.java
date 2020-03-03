package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className Test
 * @description TODO
 * @date 2020/3/3 22:00
 **/
public class Test {

    public static void main(String[] args) {
        ICat cat = new Cat();
        IDog dog = new Dog();

        cat.catchMouse();
        dog.protectHome();

        System.out.println("------------------------");

        ICat cat1 = new CatAdapter(dog);
        cat1.catchMouse();

        System.out.println("------------------------");

    }
}
