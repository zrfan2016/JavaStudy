package com.java.study.designpattern.structure.composite;

import java.util.List;

/**
 * @author zrfan
 * @className Leaf
 * @description 叶子节点
 * @date 2020/3/15 19:47
 **/
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void addSub(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List getSubs() {
        throw new UnsupportedOperationException();
    }

    public static Leaf createLeaf(String name) {
        return new Leaf(name);
    }

}
