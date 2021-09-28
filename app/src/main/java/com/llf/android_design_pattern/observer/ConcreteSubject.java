package com.llf.android_design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

//具体主题
public class ConcreteSubject implements Subject {

    // 订阅者容器
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        // 添加订阅关系
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // 移除订阅关系
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        // 通知订阅者们
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

