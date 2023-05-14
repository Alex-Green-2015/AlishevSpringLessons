package ru.green.avi.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = musicPlayer == musicPlayer2;
        System.out.println(comparison);
        System.out.println(musicPlayer);
        System.out.println(musicPlayer2);
        System.out.println();

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());

        System.out.println();
        musicPlayer.setName("Nova");
        musicPlayer.setVolume(34);
//        musicPlayer.playMusic();
        System.out.println(musicPlayer2.getName());
        System.out.println("Volume: " + musicPlayer2.getVolume());

        System.out.println();
//        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());

        context.close();
    }
}
