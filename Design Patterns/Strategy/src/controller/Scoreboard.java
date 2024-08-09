package controller;

public class Scoreboard {
    private ScoreboardBase scoreboardBase;

    public Scoreboard(ScoreboardBase scoreboardBase) {
        this.scoreboardBase = scoreboardBase;
    }

    public ScoreboardBase getScoreboardBase() {
        return scoreboardBase;
    }

    public void setScoreboardBase(ScoreboardBase scoreboardBase) {
        this.scoreboardBase = scoreboardBase;
    }

    public void showScore(int taps, int multiplier) {
        System.out.println(scoreboardBase.calculateScore(taps, multiplier));
    }
}
