package com.llf.android_design_pattern.builder;

// 省略 getter 和 setter 方法
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    public Computer(String cpu, String screen, String memory, String mainBoard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainBoard = mainBoard;
    }
}
