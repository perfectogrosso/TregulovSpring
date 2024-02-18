package org.example.tregulovspring.SpringIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Cat();
//        Person person = new Person(pet);
//        person.callYoutPet();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet",Pet.class);

        Person person = new Person(pet);
        person.callYoutPet();

        context.close();
    }
}
