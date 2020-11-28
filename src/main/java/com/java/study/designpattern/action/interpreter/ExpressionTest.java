package com.java.study.designpattern.action.interpreter;

/**
 * @Author: zrfan
 * @Date: 2020/6/6 18:51
 * @Description: TODO
 */
public class ExpressionTest {

    private static Expression getMaleExpression() {
        Expression e1 = new TerminalExpression("robot");
        Expression e2 = new TerminalExpression("jhon");
        return new OrExpression(e1, e2);
    }

    public static Expression getMarriedExpression() {
        Expression e1 = new TerminalExpression("Julie");
        Expression e2 = new TerminalExpression("Married");
        return new AndExpression(e1, e2);
    }

    public static void main(String[] args) {
        Expression maleExpression = getMaleExpression();
        Expression marryExpression = getMarriedExpression();

        System.out.println(maleExpression.interpret("jhon"));
        System.out.println(marryExpression.interpret("Married Julie"));

    }
}
