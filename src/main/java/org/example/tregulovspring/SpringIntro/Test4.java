package org.example.tregulovspring.SpringIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Sharik");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Tuzik");
////        System.out.println(myDog == yourDog);
////
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

        context.close();
    }
}
