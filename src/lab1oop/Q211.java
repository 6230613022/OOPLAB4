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
public class Q211 {
        public static void main(String[] args){
            Q21 m = new Q21("Narak","Thaswan",259.35);
            String title = m.setTitle();
            String author = m.setAuthor();
            System.out.println(title);
            System.out.println(author);
        }
}
