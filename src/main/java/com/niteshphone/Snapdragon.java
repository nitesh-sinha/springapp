package com.niteshphone;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{
    public void getProcessor() {
        System.out.println("Snapdragon processor selected");
    }
}
