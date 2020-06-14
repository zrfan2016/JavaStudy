package com.java.study.designpattern.action.memento;

/**
 * @Auther: zrfan
 * @Date: 2020/6/14 17:31
 * @Description: TODO
 */
public class Memento {

    private int state;

    public Memento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
