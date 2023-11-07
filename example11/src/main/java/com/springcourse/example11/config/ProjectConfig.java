package com.springcourse.example11.config;

import com.springcourse.example11.beans.Person;
import com.springcourse.example11.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
* spring @Configiuration annotation is a part of the spring core framework
* it indicates that the class has @Bean definition methods. So spring IOC can process the class and
* generate spring beans on startup to be used in the application*/

@Configuration
@ComponentScan(basePackages = "com.springcourse.example11.beans")
public class ProjectConfig {

    /* Naming conventions says that method names should be verbs
       but for methods which we will use to create beans can use nouns as names, as it will be more meaningful
     */

    //NOTE
//    @AutoWired can be marked/written on a field, setter, or a constructor
//    @Bean
//    Vehicle vehicle(){
//        Vehicle vehicle = new Vehicle("Toyota");
//        return vehicle;
//    }

//    @Bean
//    Person person(Vehicle vehicle){
//        Person person = new Person();
//        person.setName("Lucy");
//        person.setVehicle(vehicle);
//        return person;
//    }
}
