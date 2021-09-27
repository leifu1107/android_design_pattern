package com.llf.android_design_pattern.proxy.dynamic;

import com.llf.android_design_pattern.proxy.staticproxy.Play;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ActorProxy implements InvocationHandler {
    private Play player;

    public ActorProxy(Play player) {
        this.player = player;
    }

    /**
     * 获取动态代理对象
     */
    public Object getDynamicProxy() {
        return Proxy.newProxyInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //处理被代理对象的方法实现
        if ("show".equals(method.getName())) {
            System.out.println("代理处理show....");
            return method.invoke(player, args);
        } else if ("sing".equals(method.getName())) {
            System.out.println("代理处理sing....");
            return method.invoke(player, args);
        }
        return null;
    }
}
