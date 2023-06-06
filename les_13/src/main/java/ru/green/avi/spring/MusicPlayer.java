package ru.green.avi.spring;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Random random = new Random();
        Music randomGenre = musicList.get(random.nextInt(musicList.size()));
        for (String song : randomGenre.getSongs()) {
            System.out.println(song);
        }
    }

}
