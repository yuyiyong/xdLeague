package com.xdleague.dahei01.enumes;

public enum ResultCodeEnum {

    SUCCESS(0),
    FAIL(10),
    PARAM(20);

    private final int value;

    ResultCodeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ResultCodeEnum valueOf(int value) {
        switch (value) {
            case 10:
                return FAIL;
            case 0:
                return SUCCESS;
            case 20:
                return PARAM;
            default:
                return null;
        }

    }
}
