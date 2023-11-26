package com.springcourse.example16.config;

import com.springcourse.example16.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/*
* spring @Configiuration annotation is a part of the spring core framework
* it indicates that the class has @Bean definition methods. So spring IOC can process the class and
* generate spring beans on startup to be used in the application*/

@Configuration
@ComponentScan(basePackages = "com.springcourse.example16.beans")
public class ProjectConfig {

    /* Naming conventions says that method names should be verbs
       but for methods which we will use to create beans can use nouns as names, as it will be more meaningful
     */

    //NOTE
//    @AutoWired can be marked/written on a field, setter, or a constructor

    @Bean
    @Primary
    Speakers sony(){
        return new Sony();
    }

    @Bean
    Speakers bose(){
        return new Bose();
    }

    @Bean
    @Primary
    Tyres bridgeStone(){
        return new BridgeStone();
    }

    @Bean
    Tyres michelin(){
        return new Michelin();
    }

//    @Bean
//    Person person(Vehicle vehicle){
//        Person person = new Person();
//        person.setName("Lucy");
//        person.setVehicle(vehicle);
//        return person;
//    }
}
