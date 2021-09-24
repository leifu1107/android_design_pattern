package com.llf.android_design_pattern;

public class SingletonLanHan {

    private volatile static SingletonLanHan singletonLanHan;

    private SingletonLanHan() {
    }

    public static SingletonLanHan getInstance() {
        if (singletonLanHan == null) {
            synchronized (SingletonLanHan.class) {
                if (singletonLanHan == null) {
                    singletonLanHan = new SingletonLanHan();
                }
            }
        }
        return singletonLanHan;
    }
}
