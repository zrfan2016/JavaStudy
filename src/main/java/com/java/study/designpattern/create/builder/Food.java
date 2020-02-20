package com.java.study.designpattern.create.builder;

/**
 * @author zrfan
 * @className Food
 * @description 属性很多，构造方法的参数较多，不便识别，可读性差
 * 可部分属性赋值
 * 思考 静态内部类和内部类的区别
 * @date 2020/2/20 21:04
 **/
public class Food {
    private String name;
    private int proteins;
    private int fats;
    private int carbohydrates;
    private int salts;
    private int sugar;

    public Food() {
    }

    public Food(String name, int proteins, int fats, int carbohydrates, int salts, int sugar) {
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.salts = salts;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Food{");
        sb.append("name='").append(name).append('\'');
        sb.append(", proteins=").append(proteins);
        sb.append(", fats=").append(fats);
        sb.append(", carbohydrates=").append(carbohydrates);
        sb.append(", salts=").append(salts);
        sb.append(", sugar=").append(sugar);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getSalts() {
        return salts;
    }

    public void setSalts(int salts) {
        this.salts = salts;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    static class Builder {

        private Food food;

        public Builder() {
            this.food = new Food();
        }

        public Builder name(String name) {
            this.food.setName(name);
            return this;
        }

        public Builder proteins(int proteins) {
            this.food.setProteins(proteins);
            return this;
        }

        public Builder fats(int fats) {
            this.food.setFats(fats);
            return this;
        }

        public Builder carbohydrates(int carbohydates) {
            this.food.setCarbohydrates(carbohydates);
            return this;
        }

        public Builder salts(int salts) {
            this.food.setSalts(salts);
            return this;
        }

        public Builder sugar(int sugar) {
            this.food.setSugar(sugar);
            return this;
        }

        public Food build() {
            return this.food;
        }


    }

}
