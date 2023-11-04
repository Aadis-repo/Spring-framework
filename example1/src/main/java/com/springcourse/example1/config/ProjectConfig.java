package com.springcourse.example1.config;

import com.springcourse.example1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*
* spring @Configiuration annotation is a part of the spring core framework
* it indicates that the class has @Bean definition methods. So spring IOC can process the class and
* generate spring beans on startup to be used in the application*/

@Configuration
public class ProjectConfig {


    /* Naming conventions says that method names should be verbs
       but for methods which we will use to create beans can use nouns as names, as it will be more meaningful
     */
    @Bean
    Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    Integer number(){
        return 16;
    }

    @Bean
    String hello(){
        return "hello world";
    }
}
