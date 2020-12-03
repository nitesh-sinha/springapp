package com.niteshphone;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // specifies which is the primary bean of type MobileProcessor
public class Intelprocessor implements MobileProcessor {
    public void getProcessor() {
        System.out.println("Intel processor selected");
    }
}
