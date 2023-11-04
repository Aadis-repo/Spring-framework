package com.springcourse.example6.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public Vehicle() {
    }

    public void printHello(){
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
