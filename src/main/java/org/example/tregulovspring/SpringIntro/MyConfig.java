package org.example.tregulovspring.SpringIntro;

import jdk.jfr.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        System.out.println("!!!");
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }

}
