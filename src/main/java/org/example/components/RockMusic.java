package org.example.components;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    @Override
    public String playSong() {
        return "Playing Nirvana";
    }
}
