package com.flow.test.common.enumeration.code;

public enum UseYn implements CodeEnum {
    Y, N;

    @Override
    public String getCode() {
        return this.name();
    }

    public static UseYn fromCode(String code) {
        for (UseYn yn : values()) {
            if (yn.name().equalsIgnoreCase(code)) {
                return yn;
            }
        }
        throw new IllegalArgumentException("Unknown code: " + code);
    }
}