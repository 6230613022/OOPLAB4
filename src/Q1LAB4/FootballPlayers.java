/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1LAB4;

/**
 *
 * @author coc
 */
public class FootballPlayers extends AllPlayer {

    public FootballPlayers(String n, int j) {
        super(n, j);
    }
    public void playGame() {
        minutesPlayed = minutesPlayed + 90;
}
}
