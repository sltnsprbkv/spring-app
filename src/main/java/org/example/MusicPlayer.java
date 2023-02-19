package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    @Qualifier("classicalMusic")
    private Music music;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(MusicGenre musicGenre) {
        switch (musicGenre) {
            case ROCK -> System.out.println("Playing: " + music.getSong());
            case CLASSICAL -> System.out.println("Playing: " + music.getSong());
        }
    }


}
