package org.example.components;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{

    @Override
    public String playSong() {
        return "Playing Sedaya Night";
    }
}
