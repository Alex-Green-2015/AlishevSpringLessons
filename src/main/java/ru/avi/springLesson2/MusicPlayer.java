package ru.avi.springLesson2;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    private Music music;
//    private List<Music> musicList = new ArrayList<>();
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

//    //IoC
//    public MusicPlayer(Music music){
//        this.music = music;
//    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        for (Music music:musicList){
            System.out.println("Playing " + music.getSong());
        }
    }
}
