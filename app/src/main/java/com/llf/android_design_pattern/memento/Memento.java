package com.llf.android_design_pattern.memento;

//备忘录角色(Memonto)
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}