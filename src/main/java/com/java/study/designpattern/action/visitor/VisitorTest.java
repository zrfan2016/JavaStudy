package com.java.study.designpattern.action.visitor;

import com.java.study.designpattern.action.visitor.impl.MarriedVisitor;
import com.java.study.designpattern.action.visitor.impl.StudentVisitor;
import com.java.study.designpattern.action.visitor.impl.WorkVisitor;

/**
 * @Author: zrfan
 * @Date: 2020/6/21 15:11
 * @Description: TODO
 */
public class VisitorTest {

    public static void main(String[] args) {
        Home home = new Home();
        IVisitor student = new StudentVisitor();
        IVisitor work = new WorkVisitor();
        IVisitor married = new MarriedVisitor();

        home.accept(student);
        home.accept(work);
        home.accept(married);

    }

}
