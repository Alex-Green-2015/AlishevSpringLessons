package ru.avi.springLesson2;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> genre;
    private Music rock;

    @Value("${player.name}")
    private String name;

    @Value("${player.volume}")
    private int volume;


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> genre) {
        this.genre = genre;
    }

    public void playMusic() {
        Random random = new Random();
//        for(Music music:genre){
//            System.out.println(music.getSongs()[random.nextInt(3)]);
//        }
        int i = random.nextInt(genre.size());
        System.out.println(i + " -- ");
        System.out.println(genre.get(i).getSongs()[random.nextInt(3)]);
    }
}
