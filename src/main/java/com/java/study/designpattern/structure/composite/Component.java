package com.java.study.designpattern.structure.composite;

import java.util.List;

/**
 * @author zrfan
 * @className Component
 * @description 公共父类
 * @date 2020/3/15 19:43
 **/
public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void addSub(Component component);

    public abstract List<Component> getSubs();

    public void work() {
        System.out.println(name + " is work");
    }

}
