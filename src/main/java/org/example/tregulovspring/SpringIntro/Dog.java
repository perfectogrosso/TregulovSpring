package org.example.tregulovspring.SpringIntro;

public class Dog implements Pet{

    public Dog(){
        System.out.println("Dog Bean is created");
    }
    @Override
    public void say(){
        System.out.println("Bow-wow!");
    }
}
