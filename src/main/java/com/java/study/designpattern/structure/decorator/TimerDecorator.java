package com.java.study.designpattern.structure.decorator;

/**
 * @author zrfan
 * @className TimerDecorator
 * @description TODO
 * @date 2020/3/15 21:02
 **/
public class TimerDecorator implements CookService {

    private CookService cookService;

    public TimerDecorator(CookService cookService) {
        this.cookService = cookService;
    }

    @Override
    public void doCook(int costTime) {
        System.out.println("定时电饭煲-----启动");
        System.out.println("等待到达预定时间");
        cookService.doCook(costTime);
        System.out.println("定时电饭煲结束");
    }
}
