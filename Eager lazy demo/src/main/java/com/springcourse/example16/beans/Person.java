package com.springcourse.example16.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person {

//    public Person(){
//        System.out.println("Person bean created by spring");
//    }
   private String name = "Lucy";

   @Autowired
   private Vehicle vehicle;
    //NOTE @Autowired on constructor allows us to set fields to final

    @Autowired
   public Person(Vehicle vehicle){
       this.vehicle = vehicle;
       System.out.println("Person bean created by spring context");
   }

    public Person(){
        System.out.println("Person bean created by spring");
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
