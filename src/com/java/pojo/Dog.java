package com.java.pojo;

/**
 * description:
 * author: ws
 * time: 2020/2/24 12:34
 */
public class Dog {

    //初始化
    public void init() {
        System.out.println("Dog....init");
    }

    public Dog() {
        System.out.println("Dog....无参构造方法");
    }

    public void eat() {
        System.out.println("狗喜欢吃翔");
    }

    //销毁
    public void destroy() {
        System.out.println("Dog...destroy");
    }
}
