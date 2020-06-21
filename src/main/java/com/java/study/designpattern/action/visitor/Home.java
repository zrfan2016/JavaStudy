package com.java.study.designpattern.action.visitor;

/**
 * @Auther: zrfan
 * @Date: 2020/6/21 15:01
 * @Description: TODO
 */
public class Home {


    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

}
