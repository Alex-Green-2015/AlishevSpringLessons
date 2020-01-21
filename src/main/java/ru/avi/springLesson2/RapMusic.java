package ru.avi.springLesson2;

public class RapMusic implements Music{

    String[] songs = {"Niggas Paradise" , "F'ck them All" , "Where is my gun?"};

    @Override
    public String[] getSongs() {
        return songs;
    }

}
