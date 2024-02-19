package org.example.tregulovspring.SpringIntro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;

    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
//    @Autowired
    public Person(/*@Qualifier("dog")*/ Pet pet) {
        System.out.println("Person Bean is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person Bean is created");
    }

    public void callYoutPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Class Person: set Pet");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        System.out.println("Class Person: set surname");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Class Person: set age");
    }
}
