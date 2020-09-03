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
public class Q5 {
    public static int largestNum(int numle,int num[]){
        int max=num[0];
        int i;
        for(i=0;i<numle;i++){
            if(num[i]>max){
            max=num[i];
        }
        }
        System.out.println("max:"+max);
        return 0;
    }
    public static void main(String args[]){
        int i;
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int []num1 = new int[10]; //pragas tua pra
        for(i=0;i<length;i++){
            num1[i]=in.nextInt(); //rub kar tua pra
        }
        largestNum(length,num1);
    }
}
