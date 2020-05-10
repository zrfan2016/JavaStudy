package com.java.study.designpattern.action.mediator;

/**
 * @author zrfan 19042901
 * @date 2020/5/9 14:57
 * @description TODO
 */
public class Meat {
    private Fruit fruit;
    private Clothes clothes;

    public int fruitChange(int quantity) {
        int res = quantity / 10;
        System.out.println("用" + quantity + "份Fruit交换得到" + res + "份Meat");
        return res;
    }

    public int clothesChange(int quantity) {
        int res = quantity / 2;
        System.out.println("用" + quantity + "件Clothes交换得到" + res + "份Meat");
        return res;
    }

    public int changeFruit(int quantity) {
        return fruit.meatChange(quantity);
    }

    public int changeClothes(int quantity) {
        return clothes.meatChange(quantity);
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}
