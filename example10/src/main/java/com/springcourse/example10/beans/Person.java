package com.springcourse.example10.beans;

public class Person {
   private String name;
   private com.springcourse.example9.beans.Vehicle vehicle;

   public Person(){
       System.out.println("Person bean created by spring context");
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.springcourse.example9.beans.Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(com.springcourse.example9.beans.Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
