package com.ls.pojo;

import org.springframework.stereotype.Component;

@Component
public class Dog implements  animal{
    private  String name;

    @Override
    public void eat() {
        System.out.println("我是狗爱吃骨头~");
    }
}
