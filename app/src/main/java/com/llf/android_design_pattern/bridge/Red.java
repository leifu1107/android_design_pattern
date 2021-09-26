package com.llf.android_design_pattern.bridge;

// 红色、蓝色 → 实现部分具体实现
public class Red implements IColor {
    @Override public String draw() { return "红色"; }
}
