package ru.green.avi.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music {
    List<String> songList = Arrays.asList("Classical 1", "Classical 2", "Classical 3");

    @Override
    public List<String> getSongs() {
        return songList;
    }

    public void doMyInit() {
        System.out.println("Doing my initialization" + this.toString());
    }

    @PostConstruct
    public void doMyInit2() {
        System.out.println("Doing my initialization PRE" + this.toString());
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction" + this.toString());
    }

    @PreDestroy
    public void doMyDestroy2() {
        System.out.println("Doing my destruction DE" + this.toString());
    }
}
