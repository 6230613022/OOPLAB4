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
    public class Q21{
        private String title;
        private String author;
        private double price;
        
        public Q21(String t,String a,Double p){
            title = t;
            price = p;
            author = a;
    }
        public void setTitle(String t){
         title = t;
        }
        public void setAuthor(String a){
         author = a;
        }
        public void setPrice(Double p){
         price = p;
        }
         public  String setTitle(){
         return title;
        }
         public String setAuthor(){
         return author;
        }
    }