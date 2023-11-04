package com.springcourse.example5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
* spring @Configiuration annotation is a part of the spring core framework
* it indicates that the class has @Bean definition methods. So spring IOC can process the class and
* generate spring beans on startup to be used in the application*/

@Configuration
@ComponentScan(basePackages = "com.springcourse.example5.beans")
public class ProjectConfig {

    /* Naming conventions says that method names should be verbs
       but for methods which we will use to create beans can use nouns as names, as it will be more meaningful
     */

}
