package ru.avi.springLesson2;

public class RapMusic implements Music{

    String[] songs = {"Niggas Paradise"};

    @Override
    public String[] getSongs() {
        return songs;
    }

}
