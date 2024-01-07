package com.ls.config;


import com.ls.pojo.Cat;
import com.ls.pojo.People;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.ls.pojo")
public class MainConfig {

//    @Lazy(value = true)   //lazy-init
//    @Scope("prototype")   //scope
//    @DependsOn("")           //优先加载

}
