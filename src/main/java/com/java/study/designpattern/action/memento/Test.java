package com.java.study.designpattern.action.memento;

/**
 * @Auther: zrfan
 * @Date: 2020/6/14 22:42
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        GameProgram game=new GameProgram();

        game.play();

        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(game.createMemento());

        System.out.println(game.getState());

        game.play();
        System.out.println("gam.state = " + game.getState());

        game.setMemento(caretaker.getMemento());
        System.out.println("回复后的状态："+game.getState());

    }

}
