import controller.Scoreboard;
import model.Balloon;
import model.Clown;
import model.SquareBalloon;

public class Main {
    public static void main(String[] args) {
        int taps = 10;
        int multiplier = 2;

        Scoreboard scoreboard = new Scoreboard(new Balloon());
        System.out.print("Balloon score: ");
        scoreboard.showScore(taps, multiplier);

        scoreboard.setScoreboardBase(new Clown());
        System.out.print("Clown score: ");
        scoreboard.showScore(taps, multiplier);

        scoreboard.setScoreboardBase(new SquareBalloon());
        System.out.print("SqaureBalloon score: ");
        scoreboard.showScore(taps, multiplier);
    }
}