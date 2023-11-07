package com.springcourse.example9.main;

import com.springcourse.example9.beans.Person;
import com.springcourse.example9.beans.Vehicle;
import com.springcourse.example9.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example9 {
    public static void main(String[] args) {


        /* This project is for wiring beans using method calls

        Example shown in ProjectConfig Class and used in main class, vehicle bean has been wired in person class using method wiring

         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle.getName());
        System.out.println("Person name from spring context is: "+ person.getName());
        System.out.println("Vehicle from person class is: "+ person.getVehicle());
        /*
        * we don't need to do any explicit casting while fetching a bean from the context. spring is
        * smart enough to look for a bean of the type uou requested in ints context. if such a bean does not
        * exist then spring will throw an exception
        */
    }
}
