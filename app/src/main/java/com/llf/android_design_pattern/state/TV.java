package com.llf.android_design_pattern.state;

public class TV {

    //起始状态
    private State state;
    //关机状态
    private State offState;
    //开机状态
    private State onState;

    //起始状态为关机
    public TV() {
        offState = new OffState(this);
        onState = new OnState(this);

        state = offState;
    }

    //关机
    public void offState() {
        state.offState();
    }

    //下一个频道
    public void next() {
        state.nextState();
    }

    //上一个频道
    public void previousState() {
        state.previousState();
    }

    //开机
    public void onState() {
        state.onState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOffState() {
        return offState;
    }

    public void setOffState(State offState) {
        this.offState = offState;
    }

    public State getOnState() {
        return onState;
    }

    public void setOnState(State onState) {
        this.onState = onState;
    }
}

