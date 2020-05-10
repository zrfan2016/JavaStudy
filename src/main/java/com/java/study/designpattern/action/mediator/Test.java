package com.example.demo.mediator;

/**
 * @author zrfan 19042901
 * @date 2020/5/9 15:13
 * @description TODO
 */
public class Test {

    public static void main(String[] args) {
        testAfter();
    }

    private static void testBefore() {
        Meat meat = new Meat();
        Fruit fruit = new Fruit();
        Clothes clothes = new Clothes();

        meat.setClothes(clothes);
        meat.setFruit(fruit);

        fruit.setClothes(clothes);
        fruit.setMeat(meat);

        clothes.setFruit(fruit);
        clothes.setMeat(meat);

        int quantity = 10;

        meat.changeFruit(quantity);
        meat.changeClothes(quantity);

        fruit.changeMeat(quantity);
        fruit.changeClothes(quantity);

        clothes.changeMeat(quantity);
        clothes.changeFruit(quantity);
    }

    private static void testAfter() {
        ProductService p1 = new Product1();
        ProductService p2 = new Product2();
        ProductService p3 = new Product3();
        Money money = new Money();

        int quantity = 24;

        money.changePro(p1, quantity, p2);
    }

}
