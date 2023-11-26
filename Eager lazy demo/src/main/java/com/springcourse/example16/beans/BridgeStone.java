package com.springcourse.example16.beans;

import com.springcourse.example16.config.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStone implements Tyres {

    @Override
    public String rotate() {
        return "car is running on BridgeStone tyres";
    }
}
