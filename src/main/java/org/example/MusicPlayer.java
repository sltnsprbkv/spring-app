package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music music;

    public void playMusic(MusicGenre musicGenre) {
        switch (musicGenre) {
            case ROCK -> System.out.println("Playing: " + music.getSong());
            case CLASSICAL -> System.out.println("Playing: " + music.getSong());
        }
    }


}
