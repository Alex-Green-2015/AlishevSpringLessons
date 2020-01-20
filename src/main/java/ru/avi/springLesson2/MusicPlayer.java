package ru.avi.springLesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music classic;
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

    @Autowired
    public MusicPlayer(@Qualifier("someRock")Music rock,
                       @Qualifier("classicalMusic")Music classic) {
        this.classic = classic;
        this.rock = rock;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();
        switch (genre){
            case ROCK:
                System.out.println(rock.getSongs()[random.nextInt(3)]);
                break;
            case CLASSICAL:
                System.out.println(classic.getSongs()[random.nextInt(3)]);
                break;
            default:
                System.out.println("No such Genre");;
        }

    }
}
