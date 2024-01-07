package com.ls.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements  animal{
    @Value("小奶猫")
    String name;
    @Override
    public void eat() {
        System.out.println("我是小猫，我要吃小鱼~");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

