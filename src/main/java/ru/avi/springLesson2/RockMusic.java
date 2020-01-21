package ru.avi.springLesson2;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    String[] songs = {"Somewhere I  belong","Wind of changes","We will rock You"};

    @Override
    public String[] getSongs() {
        return songs;
    }
}
