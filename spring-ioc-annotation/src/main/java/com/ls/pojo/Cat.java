package com.ls.pojo;

public class Cat implements  animal{

    private  String name;

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
