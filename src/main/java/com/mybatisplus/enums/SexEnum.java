package com.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum SexEnum {

    NAN(0, "男"), NV(1, "女");

    @EnumValue
    private final Integer num;

    private final String name;

    SexEnum(Integer num, String name) {
        this.name = name;
        this.num = num;
    }
}