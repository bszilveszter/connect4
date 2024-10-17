package org.bsz.connect4;

public class Main {
    public static void main(String[] args) {
        // initialize players: human and computer
        Player human = new Player("Human", 'Y', true);
        Player computer = new Player("Computer", 'R', false);

        // create and start the game
        Game game = new Game(human, computer);
        game.start();
    }
}
