package org.example;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    List<String> classicalMusicList = List.of("classical song 1", "classical song 2", "classical song 3");

    @Override
    public String getSong() {
        Random rand = new Random();
        return classicalMusicList.get(rand.nextInt(classicalMusicList.size()));
    }
}
