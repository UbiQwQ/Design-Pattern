package com.innovation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: Innovation
 * @Date: 2018/8/28 09:44
 * @Vison: 1.0
 * @Description:Proxy
 * 代理对象，代理模式可以在不修改被代理对象的基础上，
 * 通过扩展代理类，进行一些功能的附加与增强。
 * 值得注意的是，代理类和被代理类应该共同实现一个接口，或者是共同继承某个类。
 */
public class Cinema implements InvocationHandler {

    private Object object;

    public Cinema(Object object) {
        super();
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ad();
        method.invoke(object,args);
        ad();
        return null;
    }

    public void ad(){
        System.out.println("advertising");
    }

}
