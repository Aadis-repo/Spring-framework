package com.springcourse.example17.beans;

import com.springcourse.example17.config.Speakers;

public class Bose implements Speakers {
    @Override
    public String play() {
        return "playing music on bose speakers";
    }
}
