package ru.avi.springLesson2;

import org.springframework.stereotype.Component;

@Component("someRock")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind of changes";
    }
}
