package com.innovation;

/**
 * @Auther: Innovation
 * @Date: 2018/8/28 09:41
 * @Vison: 1.0
 * @Description:被代理对象
 */
public class RealMovie implements Movie {

    @Override
    public void play() {
        System.out.println("<头文字D> is playing..");
    }


}
