package com.ls.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CatAop {
    @Before("execution(* com.ls.pojo.Cat.action(String))")
    public void beforeAction(){
        System.out.println("小猫正在干吗？");
    }

    @After("execution(* com.ls.pojo.Cat.action(String))")
    public void afterAction(JoinPoint joinPoint){
        System.out.println("小猫正在"+joinPoint.getArgs()[0] +"不要打断它~");

    }

}
