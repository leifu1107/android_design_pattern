package com.llf.android_design_pattern.state;

class Test {
    public static void main(String[] args) {
        TV tv = new TV();
        //开机
        tv.onState();
        //下一个频道
        tv.next();
        //上一个频道
        tv.previousState();
        //关机
        tv.offState();
    }

}
