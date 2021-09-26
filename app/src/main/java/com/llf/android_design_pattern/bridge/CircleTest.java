package com.llf.android_design_pattern.bridge;

// 测试用例
public class CircleTest {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());
        redCircle.show();
        blueSquare.show();
    }
}
