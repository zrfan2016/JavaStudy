package com.java.study.designpattern.create.builder;

import java.util.Collection;
import java.util.Objects;

/**
 * @author zrfan
 * @className CollectionUtils
 * @description TODO
 * @date 2020/2/20 22:07
 **/
public class CollectionUtils {
    private CollectionUtils() {
    }

    public static <T extends Collection> boolean isEmpty(T t) {
        if (Objects.isNull(t) || ((Collection) t).isEmpty()) {
            return true;
        }
        return false;
    }

    public static <T extends Collection> boolean isNotEmpty(T t) {
        return !isEmpty(t);
    }

}
