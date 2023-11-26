package com.springcourse.example17.main;

import com.springcourse.example17.beans.Person;
import com.springcourse.example17.beans.Vehicle;
import com.springcourse.example17.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example17 {
    public static void main(String[] args) {


        /* This project is STart for Spring AOP


         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from spring context is: "+ person.getName());
        System.out.println("Vehicle from person class is: "+ person.getVehicle().getName());

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getVehicleServcies().playMusic());
        System.out.println(vehicle.getVehicleServcies().moveVehicle());
        /*
        * we don't need to do any explicit casting while fetching a bean from the context. spring is
        * smart enough to look for a bean of the type uou requested in ints context. if such a bean does not
        * exist then spring will throw an exception
        */
    }
}
