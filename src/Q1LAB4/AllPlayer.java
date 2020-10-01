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
public class AllPlayer {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;
    
    public AllPlayer(String n,int j){
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }
    public void print(){
        System.out.println(name+": "+jerseyNumber);
    }
    public int getMinutePlayed(){
        return minutesPlayed;
    }
}
