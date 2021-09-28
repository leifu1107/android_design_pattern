package com.llf.android_design_pattern.strategy;

//策略模式的容器类
public class PaymentContext {

    private Payment payment;

    public PaymentContext(Payment payment) {
        this.payment = payment;
    }

    public void payment() {
        payment.payment();
    }
}
