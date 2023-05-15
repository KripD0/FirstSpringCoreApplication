package org.example.components;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    @Override
    public String playSong() {
        return "Playing Mozart";
    }
}
