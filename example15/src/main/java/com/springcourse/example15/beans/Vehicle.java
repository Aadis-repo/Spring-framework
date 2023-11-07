package com.springcourse.example15.beans;

import org.springframework.stereotype.Component;

public class Vehicle {
    private String name ;

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
}
