package com.niteshphone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung phone = factory.getBean(Samsung.class);
        phone.config();

//        Tyre t = (Tyre)context.getBean("tyre");
//        System.out.println(t);
    }
}
