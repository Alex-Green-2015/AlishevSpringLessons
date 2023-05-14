package ru.green.avi.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);
        Music music2 = context.getBean("musicBean", Music.class);
        Music music3 = context.getBean("musicBean", Music.class);
        System.out.println(music.getSong());
        System.out.println(music2.getSong());
        System.out.println(music3.getSong());

        context.close();
    }
}
