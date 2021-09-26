package com.llf.android_design_pattern.decorator;

class DuckDecorator extends Decorator{
    public DuckDecorator(DuckStudy duckStudy) {
        super(duckStudy);
    }

    @Override
    public void study() {
        super.study();
        //我现在又学会了一个功能
        addFly();
    }

    private void addFly() {
        System.out.println("我学会了一个新技能---我会飞啦");
    }
}
