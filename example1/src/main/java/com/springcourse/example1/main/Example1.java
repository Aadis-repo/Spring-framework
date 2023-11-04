package com.springcourse.example1.main;

import com.springcourse.example1.beans.Vehicle;
import com.springcourse.example1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle.getName());

        /*
        * we don't need to do any explicit casting while fetching a bean from the context. spring is
        * smart enough to look for a bean of the type uou requested in ints context. if such a bean does not
        * exist then spring will throw an exception
        */

        String hello = context.getBean(String.class);
        System.out.println("String value from spring context is: "+ hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from spring context is: "+ num);
    }
}
