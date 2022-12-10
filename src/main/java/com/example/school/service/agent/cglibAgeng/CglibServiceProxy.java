package com.example.school.service.agent.cglibAgeng;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibServiceProxy implements MethodInterceptor {
    private Object object;

    public CglibServiceProxy(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        //创建代理类
        Enhancer enhancer = new Enhancer();
        //继承要被代理的类
        //todo 在这继承了， 但是在哪使用了呢，
        enhancer.setSuperclass(object.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("电影即将开始，大家有序进入影厅");
        Object obj = method.invoke(object);
        System.out.println("电影结束，大家离开电影院");
        return obj;
    }
}
