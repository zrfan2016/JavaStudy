package com.java.study.designpattern.action.mediator;

/**
 * @author zrfan 19042901
 * @date 2020/5/9 15:05
 * @description TODO
 */
public class Fruit {

    private Meat meat;
    private Clothes clothes;

    public int meatChange(int quantity) {
        int res = quantity * 10;
        System.out.println("用" + quantity + "份Meat交换得到" + res + "份Fruit");
        return res;
    }

    public int clothesChange(int quantity) {
        int res = quantity * 5;
        System.out.println("用" + quantity + "件Clothes交换得到" + res + "份Fruit");
        return res;
    }

    public int changeMeat(int quantity) {
        return meat.fruitChange(quantity);
    }

    public int changeClothes(int quantity) {
        return clothes.fruitChange(quantity);
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}
