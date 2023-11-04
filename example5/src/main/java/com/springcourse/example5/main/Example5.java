package com.springcourse.example5.main;

import com.springcourse.example5.beans.Vehicle;
import com.springcourse.example5.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    public static void main(String[] args) {


        /* This project is for @Component and @ComponentScan annotation
        @Component is a stereotype annotation to make any class get under the control of spring IOC and therefore any object of that class will
        be created by spring IOC. It is basically creating bean without writing @Bean and other boilerplate code. But we have lesser control while creating beans using
        @Component.

        @ComponentScan tells the spring IOC container where to look for the @Component classes. If not specified , by default spring IOC will have to search all
        the classes in our project which will reduce performance. Therefore, we use @ComponentScan to point spring IOC towards our @Component/stereotype classes

        Example shown in ProjectConfig Class and used in main class

         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle.getName());
        vehicle.printHello();
        /*
        * we don't need to do any explicit casting while fetching a bean from the context. spring is
        * smart enough to look for a bean of the type uou requested in ints context. if such a bean does not
        * exist then spring will throw an exception
        */
    }
}
