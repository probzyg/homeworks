package io.codelex.polymorphism.practice.exercise2;


import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();

        List<Sound> sounds = new ArrayList<>();

        sounds.add(parrot);
        sounds.add(radio);
        sounds.add(firework);

        for (Sound sound : sounds) {
            System.out.print(sound.getClass().getSimpleName() + ": ");
            sound.playSound();
        }
    }
}
