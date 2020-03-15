package com.java.study.designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zrfan
 * @className Branch
 * @description 分支节点
 * @date 2020/3/15 19:48
 **/
public class Branch extends Component {

    private List<Component> subs = new ArrayList<>();

    public Branch(String name) {
        super(name);
    }

    @Override
    public void addSub(Component component) {
        this.subs.add(component);
    }

    @Override
    public List getSubs() {
        return subs;
    }

    public static Branch createBranch(String name) {
        return new Branch(name);
    }
}
