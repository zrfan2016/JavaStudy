package com.java.study.designpattern.action.strategy;

public enum StrategyEnum {

    ACT_CUTE("卖萌") {
        @Override
        public void doOperate() {
            System.out.println("卖萌");
        }
    },
    ACT_SPOILED("撒娇") {
        @Override
        public void doOperate() {
            System.out.println("撒娇");
        }
    },
    ACT_SHAMELESSLY("耍赖") {
        @Override
        public void doOperate() {
            System.out.println("耍赖");
        }
    },
    NULL("空策略") {
        @Override
        public void doOperate() {
            System.out.println("空策略");
        }
    };

    private String desc;

    StrategyEnum(String desc) {
        this.desc = desc;
    }

    public abstract void doOperate();
}
