package com.springcourse.example7.main;

import com.springcourse.example7.beans.Vehicle;
import com.springcourse.example7.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example7 {
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

        Supplier<Vehicle> volkswagenSupplier = () -> {
            Vehicle vehicle = new Vehicle("volkswagen");
            return vehicle;
        };

        Vehicle audi = new Vehicle("audi");
        Supplier<Vehicle> audiSupplier = () -> audi;

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber: "+randomNumber);

        if (randomNumber % 2 == 0){
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }
        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error creating volkswagen bean");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error creating audi bean");
        }

        if (volksVehicle != null){
            System.out.println("volkswagen bean created");
        } else {
            System.out.println("audi bean created");
        }
        /*
        * we don't need to do any explicit casting while fetching a bean from the context. spring is
        * smart enough to look for a bean of the type uou requested in ints context. if such a bean does not
        * exist then spring will throw an exception
        */
    }
}
