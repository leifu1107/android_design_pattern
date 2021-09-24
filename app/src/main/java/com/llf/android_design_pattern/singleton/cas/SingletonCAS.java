package com.llf.android_design_pattern.singleton.cas;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 6.cas单例
 *
 * java并发库提供了了很多原⼦子类来⽀支持并发访问的数据安全
 * 性； AtomicInteger 、 AtomicBoolean 、 AtomicLong 、 AtomicReference 。
 * AtomicReference 可以封装引⽤用⼀一个V实例例，⽀支持并发访问如上的单例例⽅方式就是使⽤用了了这样的⼀一个
 * 特点。
 * 使⽤用CAS的好处就是不不需要使⽤用传统的加锁⽅方式保证线程安全，⽽而是依赖于CAS的忙等算法，依赖
 * 于底层硬件的实现，来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了了额外
 * 的开销，并且可以⽀支持较⼤大的并发性。
 * 当然CAS也有⼀一个缺点就是忙等，如果⼀一直没有获取到将会处于死循环中。
 */
public class SingletonCAS {
    private static final AtomicReference<SingletonCAS> INSTANCE = new AtomicReference<SingletonCAS>();
    private static SingletonCAS instance;

    private SingletonCAS() {
    }

    public static final SingletonCAS getInstance() {
        for (; ; ) {
            SingletonCAS instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new SingletonCAS());
            return INSTANCE.get();
        }
    }
}