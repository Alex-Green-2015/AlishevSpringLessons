package ru.green.avi.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music {
    List<String> songList = Arrays.asList("Classical 1", "Classical 2", "Classical 3");

    @Override
    public String getSong() {
        Random random = new Random();
        return songList.get(random.nextInt(songList.size()));
    }
}
