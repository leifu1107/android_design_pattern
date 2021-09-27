package com.llf.android_design_pattern.memento;

//发起人角色(Originator)
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
    //保存状态到备忘录
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    //备忘录中得到状态
    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
