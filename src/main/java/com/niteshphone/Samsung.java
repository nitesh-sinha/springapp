package com.niteshphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    MobileProcessor mp;

    public MobileProcessor getMp() {
        return mp;
    }

    public void setMp(MobileProcessor mp) {
        this.mp = mp;
    }

    public void config(){
        System.out.println("This is a Galaxy S7 samsung phone");
        mp.getProcessor();
    }
}
