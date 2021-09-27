package com.llf.android_design_pattern.memento;

import java.util.ArrayList;
import java.util.List;

//负责人角色(Caretaker)
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
