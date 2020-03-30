package com.java.study.designpattern.action.command;

/**
 * @author zrfan
 * @className TestCommand
 * @description TODO
 * @date 2020/3/21 21:16
 **/
public class TestCommand {

    public static void main(String[] args) {

        AbstractCommand buyCommand = new BuyCommand("001", "79.9", "设计模式");
        Invoker seller = new Invoker();
        seller.doAction(buyCommand);

        AbstractCommand rejectCommand = new RejectCommand("001", "79.9", "设计模式", "我不想要了");
        seller.doAction(rejectCommand);
    }

}
