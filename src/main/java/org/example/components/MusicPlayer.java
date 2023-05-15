package org.example.components;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {

    private List<Music> list;


    public MusicPlayer(List<Music> list) {
        this.list = list;
    }

    public void play() {
        for (Music obj : list) {
            System.out.println(obj.playSong());
        }
    }
}
