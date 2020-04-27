package com.java.study.designpattern.action.observer;

import java.util.Observable;

/**
 * @author zrfan
 * @className Delivery
 * @description TODO
 * @date 2020/4/19 17:45
 **/
public class Delivery extends Observable {

    private String status;
    private String currentDst;

    public void updateMsg(String status, String currentDst) {
        setStatus(status);
        setCurrentDst(currentDst);
        super.setChanged();
        super.notifyObservers();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrentDst() {
        return currentDst;
    }

    public void setCurrentDst(String currentDst) {
        this.currentDst = currentDst;
    }
}
