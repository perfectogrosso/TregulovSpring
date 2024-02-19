package org.example.tregulovspring.SpringIntro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
//        person.callYoutPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Pet pet = context.getBean("catBean", Pet.class);
//        Pet pet2 = context.getBean("catBean", Pet.class);
//        pet.say();
//        pet2.say();



        context.close();
    }
}
