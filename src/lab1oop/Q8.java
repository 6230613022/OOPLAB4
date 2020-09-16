/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.oop;

/**
 *
 * @author coc
 */
 import java.util.Scanner;
public class Q8 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("n = ");
    int n = kb.nextInt();
    int k = 2;                  
    while (true) {
      if (k >= n) break;        
      if ((n % k) == 0) break;  
      k++;
    }
    System.out.println(k == n); 
  }
 
}
