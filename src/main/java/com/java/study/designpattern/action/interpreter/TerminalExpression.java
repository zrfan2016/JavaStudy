package com.java.study.designpattern.action.interpreter;

/**
 * @Auther: zrfan
 * @Date: 2020/6/6 18:44
 * @Description: TODO
 */
public class TerminalExpression implements Expression {

    private String data;
    public TerminalExpression(String data){
        this.data=data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
