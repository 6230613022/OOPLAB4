/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1oop;

/**
 *
 * @author VOVOBOOK
 */
public class Q223 {
    public static void main (String[] args){
        Q22 t= new Q22(3);
        t.setChannel(5);
        int ch = t.getChannel();
        int br = t.getAdaptiveBrightness();
        System.out.println(ch);
        String name = t.getName();
        System.out.println(name);
        System.out.println(br);
      
    }
}
