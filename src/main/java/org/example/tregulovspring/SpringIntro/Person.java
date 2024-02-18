package org.example.tregulovspring.SpringIntro;

public class Person {
    private Pet pet;

    public Person(Pet pet){
        this.pet = pet;
    }

    public void callYoutPet(){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
