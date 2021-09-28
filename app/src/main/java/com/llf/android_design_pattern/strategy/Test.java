package com.llf.android_design_pattern.strategy;

class Test {
    public static void main(String[] args) {
        //支付宝支付
        PaymentContext aliPay = new PaymentContext(new AliPayPayment());
        aliPay.payment();
        //微信支付
        PaymentContext wechatPay = new PaymentContext(new WechatPayPayment());
        wechatPay.payment();
        //银联云闪付
        PaymentContext unionPay = new PaymentContext(new UnionPayPayment());
        unionPay.payment();
    }
}
