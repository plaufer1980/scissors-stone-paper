package com.github.plaufer1980.ssp;

public enum Choice {

    PAPER(0),
    SCISSORS(1),
    STONE(2);

    final int val;

    Choice(int val) {
        this.val = val;
    }

    boolean beats(Choice c) {
        return (c.val + 1) % 3 == val;
    }

}
