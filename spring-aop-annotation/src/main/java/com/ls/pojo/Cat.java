package com.ls.pojo;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    public void action(String str){
        System.out.println("小猫正在" +str);
    }
}
