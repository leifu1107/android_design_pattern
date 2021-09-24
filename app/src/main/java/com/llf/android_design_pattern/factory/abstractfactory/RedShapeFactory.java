package com.llf.android_design_pattern.factory.abstractfactory;

//RedShapeFactory（他所代表的是红色形状这一族）
public class RedShapeFactory implements ShapeFactory {
    @Override
    public Shape getCircle() {
        return  new RedCircle();
    }

    @Override
    public Shape getRectangle() {
        return new RedRectangle();
    }
}