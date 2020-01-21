package ru.avi.springLesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        Computer computer = context.getBean(Computer.class);
//        System.out.println(musicPlayer.getVolume() + "\n" + musicPlayer.getName());
        musicPlayer.playMusic();
        List<Music> list = context.getBean("listMusicGenre", List.class);
        System.out.println("---------");

        list.add(context.getBean(ClassicalMusic.class));
        System.out.println("----------");

        musicPlayer.playMusic();

        context.close();
    }
}
