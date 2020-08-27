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
public class Q3 {
    public static float printWeather(float C){
        if(C < 0){
            System.out.println("Freezing Weather");
        }
        else if(C > 0 &&  C < 10){
            System.out.println("Very cold Weather");
        }
        else if(C >= 10 &&  C < 20){
            System.out.println(" cold Weather");
        }
        else if(C >= 20 &&  C < 30){
            System.out.println("Normal Weather");
        }
        else if(C >= 30 &&  C < 40){
            System.out.println("hot Weather");
        }
        else if(C >= 40){
            System.out.println("Very hot Weather");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        float Celcuis = in.nextFloat();
//        System.out.println("Temperature:"+printWeather(Celcuis));
        printWeather(Celcuis);
    }
            
}
