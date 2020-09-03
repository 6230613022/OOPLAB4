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
public class Q6 {
    public static void Calculate(float sum){
        double a=0;
        if(sum<=35){
            System.out.println("85");
        }
        else if(sum>35&&sum<=150){
            a=85.0+((sum-35)*1.12);
            System.out.println(a);
        }
        else if(sum>150){
            a=85.0+128.8+((sum-150)*2.13);
            System.out.println(a);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        float elec = in.nextFloat();
        Calculate(elec);
    }
}
