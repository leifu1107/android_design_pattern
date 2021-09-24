package com.llf.android_design_pattern.factory.abstractfactory;

public class TestDemo {
    public static void main(String[] args) {
        ShapeFactory redShapeFactory = new RedShapeFactory();
        Shape circle = redShapeFactory.getCircle();
        circle.draw();
        Shape rectangle = redShapeFactory.getRectangle();
        rectangle.draw();

        ShapeFactory blueShapeFactory = new BlueShapeFactory();
        Shape blueCircle = blueShapeFactory.getCircle();
        blueCircle.draw();
    }
}
