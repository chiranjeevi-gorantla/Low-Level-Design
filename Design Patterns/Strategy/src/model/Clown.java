package model;

import controller.ScoreboardBase;

public class Clown implements ScoreboardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
