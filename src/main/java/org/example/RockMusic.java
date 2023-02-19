package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    List<String> rockMusicList = List.of("rock song 1", "rock song 2", "rock song 3");

    @Override
    public String getSong() {
        Random rand = new Random();
        return rockMusicList.get(rand.nextInt(rockMusicList.size()));
    }
}
