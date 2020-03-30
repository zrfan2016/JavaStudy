package com.java.study.designpattern.action.templatemethod;

/**
 * @author zrfan
 * @className NormalPut
 * @description TODO
 * @date 2020/3/28 21:49
 **/
public class NormalPut extends AbstractPutInFridge {
    @Override
    protected void specialProcess() {
        System.out.println("用保鲜膜包一下");
    }
}
