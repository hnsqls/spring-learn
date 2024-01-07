package com.ls.aop;

import org.aspectj.lang.JoinPoint;

public class DogAop {
    public void eatRequire(){
        System.out.println("小狗已经3天没吃饭了~很饿很饿饿很饿饿饿饿饿············");
    }
    public void eatAfter(JoinPoint joinPoint){
        System.out.println("马上去买" + joinPoint.getArgs()[0]);
    }
}
