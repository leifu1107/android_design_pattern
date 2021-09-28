package com.llf.android_design_pattern.visitor;

//具体访问者(ConcreteVisitor)角色
class PersonVisitor implements Visitor {
    String name;

    public PersonVisitor(String name) {
        this.name = name;
    }

    @Override
    public void visit(Games games) {
        System.out.println(name + "-----" + games.play());
    }

    @Override
    public void visit(Photos photos) {
        System.out.println(name + "-----" + photos.watch());
    }
}

