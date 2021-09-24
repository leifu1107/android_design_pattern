package com.llf.android_design_pattern.factory.abstractfactory;

//具体颜色的Circle实现
public class BlueCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("绘制蓝色的圆");
    }
}