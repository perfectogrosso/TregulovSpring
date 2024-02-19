package org.example.tregulovspring.SpringIntro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component()
public class Dog implements Pet {


    public Dog() {
        System.out.println("Dog Bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow!");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }
}
