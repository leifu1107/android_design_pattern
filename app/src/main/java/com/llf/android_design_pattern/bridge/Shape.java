package com.llf.android_design_pattern.bridge;

// 形状 → 抽象部分
abstract class Shape {
    // 形状持有颜色引用，颜色引用通过构造函数注入，这就是桥接过程
    protected IColor color;
    public Shape(IColor color) { this.color = color; }
    abstract void show();
}