package com.llf.android_design_pattern.visitor;

//具体节点(ConcreteNode)角色：实现了抽象节点所规定的接受操作。
class Photos implements Computer {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String watch() {
        return "watch photos";
    }
}
