package org.example.tregulovspring.SpringIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //Создание объектов и зависимостей вручную
//        Pet pet = new Cat();
//        Person person = new Person(pet);
//        person.callYoutPet();

        //Создание объектов через контекст, создание зависимостей вручную
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet",Pet.class);
//
//        Person person = new Person(pet);
//        person.callYoutPet();
//
//        context.close();

        //Создание объектов и зависимостей через контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYoutPet();

        context.close();
    }
}
