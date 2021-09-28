package com.llf.android_design_pattern.state;

public class OnState implements State{

    TV tv;

    public OnState(TV tv){
        this.tv = tv;
    }

    @Override
    public void onState() {
        //无操作
    }

    @Override
    public void offState() {
        System.out.println("电视关机:欢迎下次观看~~~~~");
        tv.setState(tv.getOnState());
    }

    @Override
    public void previousState() {
        System.out.println("进入------上一个频道");
        tv.setState(tv.getOnState());
    }

    @Override
    public void nextState() {
        System.out.println("进入------下一个频道");
        tv.setState(tv.getOnState());
    }
}

