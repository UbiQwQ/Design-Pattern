package com.innovation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Auther: Innovation
 * @Date: 2018/8/28 11:14
 * @Vison: 1.0
 * @Description:动态代理模式测试类
 */
public class ProxyTest {
    public static void main(String[] args){
        RealMovie realMovie = new RealMovie();

        InvocationHandler invocationHandler = new Cinema(realMovie);

        Movie dynamicProxy  = (Movie) Proxy.newProxyInstance(RealMovie.class.getClassLoader(), RealMovie.class.getInterfaces(), invocationHandler);
        dynamicProxy.play();
    }
}
