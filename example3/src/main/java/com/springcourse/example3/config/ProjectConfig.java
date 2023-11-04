package com.springcourse.example3.config;

import com.springcourse.example3.beans.Vehicle;
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
    @Bean(name="audiVehicle")
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }
    /*
    @Bean(name = "<>")
    @Bean(value = "<>")
    @Bean("<>")
    * name,value or just "" inside braces () is enough to give a unique name to the bean
    */

    @Bean(value = "hondaVehicle")
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

}
