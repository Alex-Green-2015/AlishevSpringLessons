package ru.green.avi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    private MusicPlayer(ClassicalMusic music1, RockMusic music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

//    @Autowired
//    public void setMusic(ClassicalMusic music) {
//        this.music = music;
//    }

    public void playMusic() {
        System.out.println("Playing CL: " + classicalMusic.getSong());
        System.out.println("Playing RO: " + rockMusic.getSong());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "classicalMusic=" + classicalMusic.getSong() +
                ", rockMusic=" + rockMusic.getSong() +
                '}';
    }
}
