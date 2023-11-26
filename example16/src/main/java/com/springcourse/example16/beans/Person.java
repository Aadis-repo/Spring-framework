package com.springcourse.example16.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
   private String name = "Lucy";

   @Autowired
   private final Vehicle vehicle;
    //NOTE @Autowired on constructor allows us to set fields to final

    @Autowired
   public Person(Vehicle vehicle){
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
