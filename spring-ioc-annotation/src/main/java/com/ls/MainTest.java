package com.ls;

import com.ls.config.MainConfig;
import com.ls.pojo.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



//1. 使用注解开发注册bean
//2. 注解装配bean
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Cat bean = (Cat) context.getBean("cat");
        System.out.println(bean);
        bean.eat();

    }



}
