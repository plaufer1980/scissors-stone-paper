package com.github.plaufer1980.ssp;

import java.util.Random;

public class Player {

    private static final Random R = new Random();

    final String name;
    int score;

    Player(String name) {
        this.name = name;
    }

    public Choice choose() {
        return Choice.values()[R.nextInt(Choice.values().length)];
    }

    @Override
    public String toString() {
        return name + " (" + score + " point(s))";
    }

}
