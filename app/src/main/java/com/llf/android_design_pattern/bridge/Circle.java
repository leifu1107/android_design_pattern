package com.llf.android_design_pattern.bridge;

// 圆型、矩形 → 抽象部分扩展
public class Circle extends Shape {
    public Circle(IColor color) { super(color); }
    @Override void show() { System.out.println(color.draw() + "圆形"); }
}