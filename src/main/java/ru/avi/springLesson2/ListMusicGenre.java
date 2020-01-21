package ru.avi.springLesson2;

import java.util.ArrayList;
import java.util.List;

public class ListMusicGenre {
    public ListMusicGenre(ClassicalMusic music1 , RockMusic music2 , RapMusic music3) {
        listMusic.add(music1);
        listMusic.add(music2);
        listMusic.add(music3);
    }
    private List<Music> listMusic = new ArrayList<>();

    public List<Music> getListMusic() {
        return listMusic;
    }


}
