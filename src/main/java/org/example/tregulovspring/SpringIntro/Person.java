package org.example.tregulovspring.SpringIntro;

public class Person {
    private Pet pet;

//    public Person(Pet pet){
//        System.out.println("Person Bean is created");
//        this.pet = pet;
//    }

    public Person(){
        System.out.println("Person Bean is created");
    }

    public void callYoutPet(){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Class Person: set Pet");
    }
}
