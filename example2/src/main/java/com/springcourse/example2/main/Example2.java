package com.springcourse.example2.main;

import com.springcourse.example2.beans.Vehicle;
import com.springcourse.example2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        /* This example project is mainly for understanding NoUniqueBeanDefinitionException which occurs when we have multiple beans of the same type,
        and we tell the context to get the bean solely based on its type. context will get confused and throw the NoUniqueBeanDefinitionException.
        to resolve this, we pass the unique name of the bean to the context while fetching the bean
         */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);
        Vehicle vehicle = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle.getName());

        /*
        * we don't need to do any explicit casting while fetching a bean from the context. spring is
        * smart enough to look for a bean of the type uou requested in ints context. if such a bean does not
        * exist then spring will throw an exception
        */
    }
}
