package com.hengo.utils;

import com.hengo.enums.CodeEnum;

/**
 * Created by Hengo.
 * 2018/1/20 0:36
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T  each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
