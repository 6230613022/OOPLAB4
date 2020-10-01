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
public class playertest {
    public static void main(String[] args){
    FootballPlayers f = new FootballPlayers("Ronaldo", 7);
    BasketballPlayers b = new BasketballPlayers("James", 23);
f.print();
b.print();
f.playGame();
b.playGame();
System.out.println(f.getMinutePlayed());
System.out.println(b.getMinutePlayed());
b.changeJerseyNumber(6);
}
}
