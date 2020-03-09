package ru.alishev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.alishev.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JuzzMusic juzzMusic(){
        return new JuzzMusic();
    }

    @Bean
    public List<Music> listOfMusics(){
        return Arrays.asList(classicalMusic(), rockMusic(), juzzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(listOfMusics());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
