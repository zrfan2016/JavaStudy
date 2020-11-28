package com.java.study.designpattern.action.memento;

/**
 * @Author: zrfan
 * @Date: 2020/6/14 17:32
 * @Description: TODO
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
