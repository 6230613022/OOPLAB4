/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1oop;

/**
 *
 * @author coc
 */
import java.util.Scanner;
public class Q2 {
    public static boolean passGrade(float G) {
    if (G >= 2 && G <= 4){
        return true;
    }
    else  
    {
        return false;
    }
}
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    float passGrade1 = in.nextFloat();
    //System.out.println("You Grade "+passGrade(passGrade1));
    boolean pass = passGrade(passGrade1);
    System.out.println("You Grade "+pass);
    
    }
}
