package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * @author Neil Alishev
 */
//@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicGanre;

//    @Autowired
    public MusicPlayer(List<Music> listOfMusics) {
        this.musicGanre = listOfMusics;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicGanre.get( random.nextInt(musicGanre.size()) ).getSong();
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
