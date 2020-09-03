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
public class Q4 {
    public static int evenSum(int num){
        int i;
        int sum=0;
        for(i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
                sum=i+sum;
            }
        }
        System.out.println(sum);
        return 0;
    }
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        evenSum(num1);
    }
        

        
}
