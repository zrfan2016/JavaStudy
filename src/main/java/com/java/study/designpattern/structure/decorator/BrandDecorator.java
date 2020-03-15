package com.java.study.designpattern.structure.decorator;

/**
 * @author zrfan
 * @className BrandDecorator
 * @description TODO
 * @date 2020/3/15 21:07
 **/
public class BrandDecorator implements CookService {

    private CookService cookService;

    public BrandDecorator(CookService cookService) {
        this.cookService = cookService;
    }

    @Override
    public void doCook(int costTime) {
        System.out.println("this is xx brand rice cooker");
        cookService.doCook(costTime);
        System.out.println("brand end");
    }
}
