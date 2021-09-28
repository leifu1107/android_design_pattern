package com.llf.android_design_pattern.strategy;

public class AliPayPayment implements Payment {

    @Override
    public void payment() {
        System.out.println("支付宝支付");
    }
}
