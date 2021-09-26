package com.llf.android_design_pattern.proxy.dynamic;

import com.llf.android_design_pattern.proxy.staticproxy.Actor;
import com.llf.android_design_pattern.proxy.staticproxy.Play;

public class ProxyTest {

    public static void main(String[] args) {

        ActorProxy actorProxy = new ActorProxy(new Actor());
        //通过调用Proxy.newProxyInstance方法生成代理对象
        Play proxy = (Play) actorProxy.getDynamicProxy();
        //调用代理类相关方法
        proxy.show();
        proxy.sing(3);
    }
}

