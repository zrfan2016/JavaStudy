package com.java.study.designpattern.action.visitor.impl;

import com.java.study.designpattern.action.visitor.Home;
import com.java.study.designpattern.action.visitor.IVisitor;

/**
 * @Author: zrfan
 * @Date: 2020/6/21 15:03
 * @Description: TODO
 */
public class StudentVisitor implements IVisitor {
    @Override
    public void visit(Home home) {
        System.out.println("放假回家吃喝拿");
    }
}
