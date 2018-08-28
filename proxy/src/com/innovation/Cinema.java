package com.innovation;

/**
 * @Auther: Innovation
 * @Date: 2018/8/28 09:44
 * @Vison: 1.0
 * @Description:Proxy
 * 代理对象，代理模式可以在不修改被代理对象的基础上，
 * 通过扩展代理类，进行一些功能的附加与增强。
 * 值得注意的是，代理类和被代理类应该共同实现一个接口，或者是共同继承某个类。
 */
public class Cinema implements Movie {

    RealMovie realMovie ;

    public Cinema(RealMovie realMovie) {
        super();
        this.realMovie = realMovie;
    }

    @Override
    public void play() {
        ad();
        realMovie.play();
        ad();
    }

    public void ad(){
        System.out.println("advertising");
    }
}
