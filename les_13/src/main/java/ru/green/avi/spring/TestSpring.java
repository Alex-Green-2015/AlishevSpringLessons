package ru.green.avi.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        ClassicalMusic classicalMusic1 = context.getBean("someClassicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("someClassicalMusic", ClassicalMusic.class);

//        System.out.println(classicalMusic1);
//        System.out.println(classicalMusic2);
        context.close();
    }
}
