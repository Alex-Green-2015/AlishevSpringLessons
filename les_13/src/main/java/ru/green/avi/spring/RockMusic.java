package ru.green.avi.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {
    List<String> songList = Arrays.asList("Rock 1", "Rock 2", "Rock 3");

    @Override
    public List<String> getSongs() {
        return songList;
    }
}
