package com.llf.android_design_pattern.visitor;

//抽象节点(Node)角色：声明一个接受操作，接受一个访问者对象作为一个参数。
interface Computer {
    void accept(Visitor visitor);
}
