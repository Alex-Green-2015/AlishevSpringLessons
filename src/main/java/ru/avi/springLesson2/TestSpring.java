package ru.avi.springLesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RockMusic rockMusic = context.getBean(RockMusic.class);
        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        String[] string = context.getBeanNamesForType(RockMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer();
        List<Music> list = new ArrayList<>();
        list.add(rockMusic);
        list.add(classicalMusic);
        musicPlayer.setMusicList(list);
        musicPlayer.playMusic();

        context.close();
    }
}
