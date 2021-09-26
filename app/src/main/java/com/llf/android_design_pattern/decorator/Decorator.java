package com.llf.android_design_pattern.decorator;

public abstract class Decorator implements DuckStudy {
    protected DuckStudy duckStudy;

    public Decorator(DuckStudy duckStudy) {
        this.duckStudy = duckStudy;
    }

    @Override
    public void study() {
        duckStudy.study();
    }
}
