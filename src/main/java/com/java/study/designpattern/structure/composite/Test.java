package com.java.study.designpattern.structure.composite;

import java.util.List;
import java.util.Objects;

/**
 * @author zrfan
 * @className Test
 * @description 场景类
 * @date 2020/3/15 19:50
 **/
public class Test {

    public static void main(String[] args) {
        Component root = createTest();
        doWork(root);
    }

    /**
     * 递归调用
     *
     * @param component
     */
    private static void doWork(Component component) {
        if (component instanceof Leaf) {
            component.work();
        } else {
            component.work();
            List<Component> list = component.getSubs();
            if (Objects.nonNull(list) && !list.isEmpty()) {
                for (Component sub : list) {
                    doWork(sub);
                }
            }
        }
    }

    private static Component createTest() {
        Component root = new Branch("root");
        Component l1 = Leaf.createLeaf("l1");
        Component l2 = Leaf.createLeaf("l2");
        Component l3 = Leaf.createLeaf("l3");
        Component l4 = Leaf.createLeaf("l4");
        Component l5 = Leaf.createLeaf("l5");
        Component br1 = Branch.createBranch("br1");
        Component br2 = Branch.createBranch("br2");
        Component br3 = Branch.createBranch("br3");

        br1.addSub(l1);
        br2.addSub(l2);
        br3.addSub(l3);
        br1.addSub(l4);
        br3.addSub(l5);

        root.addSub(br1);
        root.addSub(br2);
        root.addSub(br3);
        return root;
    }
}
