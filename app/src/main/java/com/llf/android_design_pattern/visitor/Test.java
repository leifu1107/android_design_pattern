package com.llf.android_design_pattern.visitor;

class Test {
    public static void main(String[] args) {
        // 创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        // 给结构增加一个节点
        os.add(new Games());
        // 给结构增加一个节点
        os.add(new Photos());

        // 创建2个访问者
        Visitor visitorZhangSan = new PersonVisitor("zhangsan");
        Visitor visitorLisi = new PersonVisitor("lisi");

        os.action(visitorZhangSan);
        os.action(visitorLisi);
    }
}
