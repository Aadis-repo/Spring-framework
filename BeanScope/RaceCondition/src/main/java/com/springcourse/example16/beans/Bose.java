package com.springcourse.example16.beans;

import com.springcourse.example16.config.Speakers;

public class Bose implements Speakers {
    @Override
    public String play() {
        return "playing music on bose speakers";
    }
}
