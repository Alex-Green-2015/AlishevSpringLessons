package ru.avi.springLesson2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

//    @Bean
//    public ListMusicGenre listMusicGenre(){
//        return new ListMusicGenre(classicalMusic(),rockMusic(),rapMusic());
//    }

    @Bean
    public List<Music> listMusicGenre(){
        return new ArrayList<>(Arrays.asList(classicalMusic(),rockMusic(),rapMusic()));
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(listMusicGenre());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
