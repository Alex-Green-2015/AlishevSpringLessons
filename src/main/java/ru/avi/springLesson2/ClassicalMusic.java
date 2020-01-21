package ru.avi.springLesson2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music{

    String[] songs = {"Symphony #5","Hungarian Rhapsody","Nocturnes, Op. 9"};

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my Initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my Destruction");
    }

    @Override
    public String[] getSongs() {
        return songs;
    }

}
