package ru.avi.springLesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        Computer computer = context.getBean(Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}
