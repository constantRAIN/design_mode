package com.example.school.service.agent.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        RealMovie realMovie = new RealMovie();
        InvocationHandler proxyMovie = new ProxyMovie(realMovie);
        // 创建代理对象
        Movie movie = (Movie) Proxy.newProxyInstance(
                realMovie.getClass().getClassLoader(),
                realMovie.getClass().getInterfaces(),
                proxyMovie);
        System.out.println(movie.getClass().getSimpleName());
        movie.play();
    }
}
