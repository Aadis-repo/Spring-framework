package com.springcourse.example3.main;

import com.springcourse.example3.beans.Vehicle;
import com.springcourse.example3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {


        // This project was for naming the beans
        /*
        @Bean(name = "<>")
        @Bean(value = "<>")
        @Bean("<>")
        * name,value or just "" inside braces () is enough to give a unique name to the bean
        */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle1.getName());

        Vehicle vehicle2 = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle2.getName());

        Vehicle vehicle3 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle3.getName());
        /*
        * we don't need to do any explicit casting while fetching a bean from the context. spring is
        * smart enough to look for a bean of the type uou requested in ints context. if such a bean does not
        * exist then spring will throw an exception
        */
    }
}
