package com.springcourse.example17.beans;

import com.springcourse.example17.config.Speakers;
import com.springcourse.example17.config.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    @Qualifier("bose")
    private Speakers speakers;

    @Autowired
    @Qualifier("bridgeStone")
    private Tyres tyres;


    public String playMusic(){
        return speakers.play();
    }

    public String moveVehicle(){
        return tyres.rotate();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
