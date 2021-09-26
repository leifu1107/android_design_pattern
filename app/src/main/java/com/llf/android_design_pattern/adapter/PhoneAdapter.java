package com.llf.android_design_pattern.adapter;

public class PhoneAdapter implements Adapter {//手机适配器类
    private Electric mElectric;//适配器持有源目标对象

    public PhoneAdapter(Electric electric) {//通过构造方法传入对象
        mElectric = electric;
    }

    @Override
    public int convert_5v() {
        System.out.println("适配器开始工作：");
        System.out.println("输入电压：" + mElectric.output_220v());
        System.out.println("输出电压：" + 5);
        return 5;
    }
}
