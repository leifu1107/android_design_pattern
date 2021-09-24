package com.llf.android_design_pattern.singleton;

import com.llf.android_design_pattern.singleton.ehan.SingletonEHan;
import com.llf.android_design_pattern.singleton.enums.SingletonEnum;

class Test {
    public static void main(String[] args) {
        SingletonEHan.getInstance();
        SingletonEnum.instance.test();
    }
}

