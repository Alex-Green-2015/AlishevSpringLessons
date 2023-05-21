package ru.green.avi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    private MusicPlayer(@Qualifier("someRockMusic") Music music1,
                        @Qualifier("someClassicalMusic") Music music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public void playMusic(MusicGenre genre) {
        if (MusicGenre.ROCK.equals(genre)) {
            System.out.println("Playing RO: " + rockMusic.getSong());
        } else {
            System.out.println("Playing CL: " + classicalMusic.getSong());
        }
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "classicalMusic=" + classicalMusic.getSong() +
                ", rockMusic=" + rockMusic.getSong() +
                '}';
    }
}
