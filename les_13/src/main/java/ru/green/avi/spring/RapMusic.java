package ru.green.avi.spring;

import java.util.Arrays;
import java.util.List;

public class RapMusic implements Music {
    List<String> songList = Arrays.asList("2Pac - Ghetto life", "Rap 2", "Rap 3");

    @Override
    public List<String> getSongs() {
        return songList;
    }

}
