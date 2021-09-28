package com.llf.android_design_pattern.state;

public interface State {

    /**
     * 开机
     */
    void onState();

    /**
     * 关机
     */
    void offState();

    /**
     * 上一个频道
     */
    void previousState();

    /**
     * 下一个频道
     */
    void nextState();
}

