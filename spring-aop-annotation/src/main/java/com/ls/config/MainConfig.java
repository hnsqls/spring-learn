package com.ls.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.ls.pojo")
@ComponentScan("com.ls.aop")//扫包扫描包中@Component所注释的类，注册成bean
@EnableAspectJAutoProxy //使用注解Aop要开启
public class MainConfig {
}
