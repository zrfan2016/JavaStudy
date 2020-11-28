package com.java.study.designpattern.specification;

/**
 * @Author: zrfan
 * @Date: 2020/8/24 21:35
 * @Description: TODO
 */
public class AndConditon extends AbstractCondition {

    private Condition left;
    private Condition right;

    public AndConditon(Condition left, Condition right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toSql() {
        return left.toSql() + " and " + right.toSql();
    }
}
