package com.llf.android_design_pattern.observer;

class Test {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        // 这里添加2个观察者
        ConcreteObserver concreteObserver1 = new ConcreteObserver("观察者1");
        subject.addObserver(concreteObserver1);
        subject.addObserver(new ConcreteObserver("观察者2"));

        //通知观察者更新数据
        subject.notifyObservers("第一次");
        //输出结果：
        //观察者1 知道了你更新了第一次
        //观察者2 知道了你更新了第一次

        // 删除第一个观察者测试
        subject.removeObserver(concreteObserver1);
        //通知观察者更新数据(只有观察者2才会收到更新内容)
        subject.notifyObservers("第二次");
        // 输出结果：
        // 观察者2 知道了你更新了第二次
    }
}
