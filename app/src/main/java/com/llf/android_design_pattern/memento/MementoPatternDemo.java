package com.llf.android_design_pattern.memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        //发起人角色(Originator)
        Originator originator = new Originator();
        //负责人角色(Caretaker)
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        //保存状态到备忘录
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        //保存状态到备忘录
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
