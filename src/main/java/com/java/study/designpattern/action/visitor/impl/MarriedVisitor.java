package com.java.study.designpattern.action.visitor.impl;

import com.java.study.designpattern.action.visitor.Home;
import com.java.study.designpattern.action.visitor.IVisitor;

/**
 * @Auther: zrfan
 * @Date: 2020/6/21 15:08
 * @Description: TODO
 */
public class MarriedVisitor implements IVisitor {
    @Override
    public void visit(Home home) {
        System.out.println("结婚后重心会向自己的小家偏移，回家基本都会带着老婆孩子一起回去");
    }
}
