package com.llf.android_design_pattern.proxy.staticproxy;

public class Actor implements Play {
    @Override
    public void sing(int count) {
        System.out.print("唱了" + count + "首歌");
    }

    @Override
    public void show() {
        System.out.print("进行演出");
    }
}
