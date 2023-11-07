package com.springcourse.example15.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
   private String name = "Lucy";

   private final Vehicle vehicle;
    //NOTE @Autowired on constructor allows us to set fields to final

    @Autowired
   public Person(@Qualifier("honda") Vehicle vehicle){
       this.vehicle = vehicle;
       System.out.println("Person bean created by spring context");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
