package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

//        System.out.println(classicalMusic1.getSong());


//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer1.playMusic();
//
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());
//
//        // scope prototype (false), singleton (true)
//        System.out.println(musicPlayer1 == musicPlayer2);
        context.close();
    }
}
