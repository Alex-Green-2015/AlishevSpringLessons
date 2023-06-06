package ru.green.avi.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music {
    List<String> songList = Arrays.asList("Classical 1", "Classical 2", "Classical 3");

    @Override
    public List<String> getSongs() {
        return songList;
    }

}
