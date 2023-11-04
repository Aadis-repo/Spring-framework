package com.springcourse.example4.main;

import com.springcourse.example4.beans.Vehicle;
import com.springcourse.example4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {


        // This project was for @Primary annotation used in projectConfig class on ferrariVehicle Bean
        // when we try to get one of the many beans of the same type for example Vehicle Bean, but there are 3 vehicle beans, so it is
        // difficult for spring IOC to decide which one, we can set @Primary annotation , so that , if we do not pass the bean name with bean type,
        // then the bean annotated with @Primary will be selected
        // Also we can only annotate 1 class with @Primary, if we use @Primary in multiple places then we will NoUniqueBeanDefinitionException
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle1.getName());

        Vehicle vehicle2 = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle2.getName());

        Vehicle vehicle3 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle3.getName());
        /*
        * we don't need to do any explicit casting while fetching a bean from the context. spring is
        * smart enough to look for a bean of the type uou requested in ints context. if such a bean does not
        * exist then spring will throw an exception
        */
    }
}
