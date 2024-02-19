package org.example.tregulovspring.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.tregulovspring.AOP")
@EnableAspectJAutoProxy
public class Config {

}
