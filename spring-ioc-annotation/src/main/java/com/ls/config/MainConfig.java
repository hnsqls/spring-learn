package com.ls.config;


import com.ls.pojo.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean(name = "cat",initMethod = "",destroyMethod = "",autowireCandidate = false,)
    public  Cat GetCat(){
        return  new  Cat();
    }
}
