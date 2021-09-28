package com.llf.android_design_pattern.strategy;

public class WechatPayPayment implements Payment {

    @Override
    public void payment() {
        System.out.println("微信支付");
    }
}
