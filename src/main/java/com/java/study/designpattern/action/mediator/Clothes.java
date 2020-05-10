package com.java.study.designpattern.action.mediator;

/**
 * @author zrfan 19042901
 * @date 2020/5/9 15:13
 * @description TODO
 */
public class Clothes {
    private Meat meat;
    private Fruit fruit;

    public int meatChange(int quantity) {
        int res = quantity * 2;
        System.out.println("用" + quantity + "份Meat交换得到" + res + "件Clothes");
        return res;
    }

    public int fruitChange(int quantity) {
        int res = quantity / 5;
        System.out.println("用" + quantity + "份Fruit交换得到" + res + "件Clothes");
        return res;
    }

    public int changeMeat(int quantity) {
        return meat.clothesChange(quantity);
    }

    public int changeFruit(int quantity) {
        return fruit.clothesChange(quantity);
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}
