package com.springcourse.example17.beans;

import com.springcourse.example17.config.Tyres;
import org.springframework.stereotype.Component;

@Component
public class Michelin implements Tyres {

    @Override
    public String rotate() {
        return "car is running on Michelin tyres";
    }
}
