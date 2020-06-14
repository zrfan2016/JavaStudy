package com.java.study.designpattern.action.memento;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;

/**
 * @Auther: zrfan
 * @Date: 2020/6/14 17:31
 * @Description: TODO
 */
public class GameProgram {

   private int state;

    private Random random=new Random();

    public void play(){
        state=random.nextInt(100);
    }
    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void setMemento(Memento m){
        this.state=m.getState();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}