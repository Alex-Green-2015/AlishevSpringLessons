package ru.avi.springLesson2;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        System.out.println("Computer " + id + "\n");
        musicPlayer.playMusic(Genre.CLASSICAL);
        musicPlayer.playMusic(Genre.ROCK);
        return "";
    }
}
