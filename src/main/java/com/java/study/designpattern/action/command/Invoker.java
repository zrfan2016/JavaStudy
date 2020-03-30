package com.java.study.designpattern.action.command;

/**
 * @author zrfan
 * @className Invoker
 * @description TODO
 * @date 2020/3/21 20:32
 **/
public class Invoker {

    public void doAction(AbstractCommand command) {
        command.execute();
    }

}
