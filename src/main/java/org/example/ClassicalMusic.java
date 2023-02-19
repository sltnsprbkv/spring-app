package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{
    List<String> classicalMusicList = List.of("classical song 1", "classical song 2", "classical song 3");

    @PostConstruct
    public void doMyInit() {
        System.out.println("INIT...");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("DESTROY...");
    }

    @Override
    public String getSong() {
        Random rand = new Random();
        return classicalMusicList.get(rand.nextInt(classicalMusicList.size()));
    }
}
