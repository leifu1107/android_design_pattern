package com.llf.android_design_pattern.observer;

//具体的观察者
class ConcreteObserver implements Observer {
    String name;

    //此处只想验证多个观察者 只是添加了名字区分一下
    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        // 模拟处理业务逻辑
        System.out.println(name + " 知道了你更新了" + message);
    }
}
