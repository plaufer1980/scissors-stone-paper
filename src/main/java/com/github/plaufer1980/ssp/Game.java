package com.github.plaufer1980.ssp;

public class Game {

    final Player p1;
    final Player p2;
    final int MATCH_POINTS = 2;

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Player run() {
        System.out.println(p1 + "\t" + p2);

        while (p1.score < MATCH_POINTS && p2.score < MATCH_POINTS) {
            Choice c1 = p1.choose();
            Choice c2 = p2.choose();
            System.out.println(p1 + " chose " + c1);
            System.out.println(p2 + " chose " + c2);
            p1.score += c1.beats(c2) ? 1 : 0;
            p2.score += c2.beats(c1) ? 1 : 0;
            System.out.println(p1 + "\t" + p2);
        }

        return p1.score >= MATCH_POINTS ? p1 : p2;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to SCISSORS - STONE - PAPER!");
        Player p1 = new Player("Computer");
        Player p2 = new ConsolePlayer("You");
        Game game = new Game(p1, p2);
        Player winner = game.run();
        System.out.println(winner + " has won the match!");
    }

}