package com.springcourse.example15.config;

import com.springcourse.example15.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
* spring @Configiuration annotation is a part of the spring core framework
* it indicates that the class has @Bean definition methods. So spring IOC can process the class and
* generate spring beans on startup to be used in the application*/

@Configuration
@ComponentScan(basePackages = "com.springcourse.example15.beans")
public class ProjectConfig {

    /* Naming conventions says that method names should be verbs
       but for methods which we will use to create beans can use nouns as names, as it will be more meaningful
     */

    //NOTE
//    @AutoWired can be marked/written on a field, setter, or a constructor
    @Bean(name = "audi")
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle("Audi");
        return vehicle;
    }

    @Bean(name = "honda")
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle("Honda");
        return vehicle;
    }

    @Bean("ferrari")
    Vehicle vehicle3(){
        Vehicle vehicle =new Vehicle("Ferrari");
        return vehicle;
    }




//    @Bean
//    Person person(Vehicle vehicle){
//        Person person = new Person();
//        person.setName("Lucy");
//        person.setVehicle(vehicle);
//        return person;
//    }
}
