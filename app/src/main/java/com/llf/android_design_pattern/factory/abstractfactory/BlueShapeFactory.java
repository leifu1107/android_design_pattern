package com.llf.android_design_pattern.factory.abstractfactory;

//BlueShapeFactory（他所代表的是兰色形状这一族）
public class BlueShapeFactory implements ShapeFactory {
    @Override
    public Shape getCircle() {
        return new BlueCircle();
    }

    @Override
    public Shape getRectangle() {
        return new BlueRectangle();
    }
}
