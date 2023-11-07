package com.springcourse.example14.main;

import com.springcourse.example14.beans.Person;
import com.springcourse.example14.config.ProjectConfig;
import com.springcourse.example14.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example14 {
    public static void main(String[] args) {


        /* This project is for wiring beans using method calls

        Example shown in ProjectConfig Class and used in main class, auto wiring using @Autowired on Constructor method

        //NOTE
        @AutoWired can be marked/written on a field, setter, or a constructor

        In this project we will show how to use autoWire on Constructor. recommended approach as it allows
        us to set fields to final

        //NOTE
        In scenarios where the bean which we want to auto-wire is not available then also we want to start the application then we use
        @Autowired(require = false), by default it is true but if not avl then also application will start
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
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
