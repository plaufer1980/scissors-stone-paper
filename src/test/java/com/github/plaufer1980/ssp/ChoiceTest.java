package com.github.plaufer1980.ssp;

import static com.github.plaufer1980.ssp.Choice.PAPER;
import static com.github.plaufer1980.ssp.Choice.SCISSORS;
import static com.github.plaufer1980.ssp.Choice.STONE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChoiceTest {

    @Test
    public void rules() {
        assertFalse(PAPER.beats(SCISSORS));
        assertFalse(PAPER.beats(PAPER));
        assertTrue(PAPER.beats(STONE));

        assertFalse(SCISSORS.beats(STONE));
        assertFalse(SCISSORS.beats(SCISSORS));
        assertTrue(SCISSORS.beats(PAPER));

        assertFalse(STONE.beats(PAPER));
        assertFalse(STONE.beats(STONE));
        assertTrue(STONE.beats(SCISSORS));
    }

}