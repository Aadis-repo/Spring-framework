package com.springcourse.example16.beans;

import com.springcourse.example16.config.Speakers;

public class Sony implements Speakers {
    @Override
    public String play() {
        return "playing music using sony speakers";
    }

}
