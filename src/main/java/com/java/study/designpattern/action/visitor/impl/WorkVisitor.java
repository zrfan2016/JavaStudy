package com.java.study.designpattern.action.visitor.impl;

import com.java.study.designpattern.action.visitor.Home;
import com.java.study.designpattern.action.visitor.IVisitor;

/**
 * @Auther: zrfan
 * @Date: 2020/6/21 15:05
 * @Description: TODO
 */
public class WorkVisitor implements IVisitor {
    @Override
    public void visit(Home home) {
        System.out.println("回家看望会买东西，会问家里是否有其他需要");
    }
}
