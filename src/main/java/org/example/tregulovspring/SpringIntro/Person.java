package org.example.tregulovspring.SpringIntro;

public class Person {
    private Pet pet;

    public Person(Pet pet){
        System.out.println("Person Bean is created");
        this.pet = pet;
    }

    public void callYoutPet(){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
