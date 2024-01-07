package com.ls.pojo;

import org.springframework.stereotype.Component;

@Component
public class Cat implements  animal{
    @Override
    public void eat() {
        System.out.println("我是小猫，我要吃小鱼~");
    }


}
