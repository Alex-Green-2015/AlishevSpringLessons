package ru.green.avi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private Music classicalMusic;
    private Music rockMusic;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    private MusicPlayer(@Qualifier("someRockMusic") Music music1,
                        @Qualifier("someClassicalMusic") Music music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        List<String> songs;
        if (MusicGenre.ROCK.equals(genre)) {
            songs = rockMusic.getSongs();
            System.out.println("Playing RO: " + songs.get(random.nextInt(songs.size())));
        } else {
            songs = classicalMusic.getSongs();
            System.out.println("Playing CL: " + songs.get(random.nextInt(songs.size())));
        }
    }

}
