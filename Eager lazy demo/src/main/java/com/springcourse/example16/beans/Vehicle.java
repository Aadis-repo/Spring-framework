package com.springcourse.example16.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Honda" ;

    @Autowired
    private VehicleServices vehicleServices;
    public Vehicle() {
        System.out.println("Vehicle Bean is created");
    }

    public void printHello(){
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
    public Vehicle(String name) {
        this.name = name;
        System.out.println("Vehicle Bean is created with name: "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public VehicleServices getVehicleServcies() { return vehicleServices;}
}
