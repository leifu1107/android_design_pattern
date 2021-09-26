package com.llf.android_design_pattern.decorator;

public class TestDemo {
    public static void main(String[] args) {
        Duck duck = new Duck();

        DuckDecorator duckDecorator = new DuckDecorator(duck);
        duckDecorator.study();

    }
}
