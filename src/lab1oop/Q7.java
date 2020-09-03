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
public class Q7 {
   public static void printLeftPyramid(){
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printPyramid(){
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++)
                System.out.print(" ");
            for(int k=0;k<(2*i)+1;k++)
                System.out.print("*");
            System.out.println("");
        }
    }
    public static void main(String[]args){
        printLeftPyramid();
        printPyramid();
    } 
}