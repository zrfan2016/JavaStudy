package com.java.study.designpattern.specification;

/**
 * @Author: zrfan
 * @Date: 2020/8/24 21:36
 * @Description: TODO
 */
public class OrCondition extends AbstractCondition {

    private Condition left;
    private Condition right;

    public OrCondition(Condition left, Condition right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toSql() {
        return "(" + left.toSql() + " or " + right.toSql() + ")";
    }
}
