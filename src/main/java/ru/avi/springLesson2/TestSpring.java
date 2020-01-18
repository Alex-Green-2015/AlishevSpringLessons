package ru.avi.springLesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        MusicPlayer secondPlayer = context.getBean(MusicPlayer.class);
        boolean compare = musicPlayer == secondPlayer;

        System.out.println(compare);
        musicPlayer.setVolume(44);
        System.out.println(musicPlayer.getVolume());
        System.out.println(secondPlayer.getVolume());

        context.close();
    }
}
