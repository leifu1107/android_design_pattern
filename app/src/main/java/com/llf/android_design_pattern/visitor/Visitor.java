package com.llf.android_design_pattern.visitor;

//抽象访问者(Visitor)角色
interface Visitor {
    //可以访问游戏
    void visit(Games games);

    //可以访问图片
    void visit(Photos photos);
}
