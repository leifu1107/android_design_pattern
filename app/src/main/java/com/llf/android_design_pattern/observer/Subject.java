package com.llf.android_design_pattern.observer;

//抽象主题的接口
public interface Subject {
    // 添加订阅关系
    void addObserver(Observer observer);

    // 移除订阅关系
    void removeObserver(Observer observer);

    // 通知订阅者
    void notifyObservers(String message);
}

