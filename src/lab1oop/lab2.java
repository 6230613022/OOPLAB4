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
class GetInputFromUser
{
    public static void main(String args[])
{
// Using Scanner for Getting Input from User
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    System.out.println("You entered integer "+a);
    float b = in.nextFloat();
    System.out.println("You entered float "+b);
        }
    }
