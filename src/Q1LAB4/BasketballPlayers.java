package Q1LAB4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coc
 */
public class BasketballPlayers extends AllPlayer{

    public BasketballPlayers(String n, int j) {
        super(n, j);
    }
    public void playGame() {
        minutesPlayed = minutesPlayed + 48;
}
    public void changeJerseyNumber (int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name+"Change number to"+jerseyNumber);
}
}
