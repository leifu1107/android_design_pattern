package com.llf.android_design_pattern.factory.abstractfactory;

//具体颜色的Rectange实现
public class RedRectangle extends Rectangle {
    @Override
    public void draw() {
        System.out.println("绘制红色长方形");
    }
}
