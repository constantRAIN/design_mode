package com.example.school.service.agent.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyMovie implements InvocationHandler {
    private Object movie;

    public ProxyMovie(Object movie) {
        this.movie = movie;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("电影还没开始，买瓶可乐");
        method.invoke(movie, args);
        System.out.println("电影已经结束，买一只恐龙模型");
        return null;
    }
}
