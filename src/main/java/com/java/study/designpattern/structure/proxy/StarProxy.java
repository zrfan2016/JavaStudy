package com.java.study.designpattern.structure.proxy;

import java.util.Objects;

/**
 * @author zrfan
 * @className StarProxy
 * @description TODO
 * @date 2020/3/16 21:36
 **/
public class StarProxy implements IStar {

    private IStar star;

    public StarProxy(IStar star) {
        this.star = star;
        if (Objects.isNull(this.star)) {
            this.star = NullStar.getNullStar();
        }
    }

    @Override
    public void act() {
        this.star.act();
    }

    @Override
    public void sing() {
        this.star.sing();
    }

    @Override
    public void dance() {
        this.star.dance();
    }


}
