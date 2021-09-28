package com.llf.android_design_pattern.strategy;

public class UnionPayPayment implements Payment {

    @Override
    public void payment() {
        System.out.println("银联云闪付");
    }
}