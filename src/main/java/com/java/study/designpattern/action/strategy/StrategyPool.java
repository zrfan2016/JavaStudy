package com.java.study.designpattern.action.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author zrfan
 * @className StrategyPool
 * @description TODO
 * @date 2020/3/30 21:40
 **/
public class StrategyPool {

    private static Map<StrategyEnum, IStrategy> pool = new HashMap<>(8);

    static {
        pool.put(StrategyEnum.ACT_CUTE, new ActCuteStrategy());
        pool.put(StrategyEnum.ACT_SHAMELESSLY, new ActShamelesslyStrategy());
        pool.put(StrategyEnum.ACT_SPOILED, new ActSpoiledStrategy());
        pool.put(StrategyEnum.NULL, new NullStrategy());
    }

    public static IStrategy getStrategy(StrategyEnum type) {
        IStrategy strategy = pool.get(type);
        if (Objects.isNull(strategy)) {
            strategy = pool.get(StrategyEnum.NULL);
        }
        return strategy;
    }

}
