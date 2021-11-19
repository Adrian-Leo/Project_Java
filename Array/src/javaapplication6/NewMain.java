/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author lenovo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    private static void latihan() {
    
     String [] kalimat = {"Hello World","CCIT-FTUI","Komunitas Android CCIT-FTUI","Saya adalah Programmer","saya mahasiswa baru tapi saya bisa coding"};
           
             for (int x = 0; x < kalimat.length; x++){
                System.out.println("kalimat ke-"+x+": " + kalimat[x]);
            } 
     }
    
    private static void latihan2() {
        int [] angka = new int [] {1,4,5,7,8,9,2,3,45,8,41,22,33};
        System.out.println(angka[3]);
        System.out.println(angka[8]);
    }
    
public static void main (String[] args){
        latihan2();
}
    
}
