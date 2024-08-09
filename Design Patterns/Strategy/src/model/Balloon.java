package model;

import controller.ScoreboardBase;

public class Balloon implements ScoreboardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }
}
