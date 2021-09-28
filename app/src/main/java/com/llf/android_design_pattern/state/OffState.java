package com.llf.android_design_pattern.state;

public class OffState implements State {

    TV tv;

    public OffState(TV tv){
        this.tv = tv;
    }

    @Override
    public void onState() {
        System.out.println("电视开机:欢迎~~~");
        //状态变为开机
        tv.setState(tv.getOnState());
    }

    @Override
    public void offState() {
        //无操作
    }

    @Override
    public void previousState() {
        //无操作
    }

    @Override
    public void nextState() {
        //无操作
    }
}

