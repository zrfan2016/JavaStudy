package com.java.study.designpattern.action.templatemethod;

/**
 * @author zrfan
 * @className AbstarctPutInFridge
 * @description TODO
 * @date 2020/3/28 21:43
 **/
public abstract class AbstractPutInFridge {

    public void putInFridge() {
        // first open door
        openDoor();
        specialProcess();
        closeDoor();
    }

    protected void openDoor() {
        System.out.println("打开冰箱门");
    }

    protected abstract void specialProcess();

    protected void closeDoor() {
        System.out.println("关上冰箱门");
    }
}
