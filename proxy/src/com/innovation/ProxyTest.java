package com.innovation;

/**
 * @Auther: Innovation
 * @Date: 2018/8/28 11:14
 * @Vison: 1.0
 * @Description:静态代理模式测试类
 */
public class ProxyTest {
    public static void main(String[] args){
        RealMovie realMovie = new RealMovie();
        Movie movie = new Cinema(realMovie);
        movie.play();
    }
}
