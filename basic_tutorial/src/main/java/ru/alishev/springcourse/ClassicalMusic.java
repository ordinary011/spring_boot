package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Neil Alishev
 */
//@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("initizlization of ClassicalMusic");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("destroying ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
