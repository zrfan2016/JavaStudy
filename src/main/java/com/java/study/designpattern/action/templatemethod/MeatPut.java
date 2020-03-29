package com.java.study.designpattern.action.templatemethod;

/**
 * @author zrfan
 * @className MeatPut
 * @description TODO
 * @date 2020/3/28 21:50
 **/
public class MeatPut extends AbstractPutInFridge {
    @Override
    protected void specialProcess() {
        System.out.println("切成小块包好放到冷冻区");
    }
}
