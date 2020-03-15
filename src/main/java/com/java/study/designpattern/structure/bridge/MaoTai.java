package com.java.study.designpattern.structure.bridge;

/**
 * @author zrfan
 * @className MaoTai
 * @description TODO
 * @date 2020/3/10 22:36
 **/
public class MaoTai extends Wine {
    @Override
    public void beMake() {
        System.out.println("酿造茅台");
    }
}
