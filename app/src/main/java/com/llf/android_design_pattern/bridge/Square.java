package com.llf.android_design_pattern.bridge;

public class Square extends Shape {
    public Square(IColor color) { super(color); }
    @Override void show() { System.out.println(color.draw() + "矩形"); }
}
