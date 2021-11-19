/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input.system.user;

import java.util.Scanner;
        
/**
 *
 * @author lenovo
 */
public class InputSystemUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // rumus luas persegi panjang
        Scanner userInput = new Scanner (System.in);
        int panjang, lebar, luas , tinggi , volume;
        System.out.println("RUMUS LUAS PERSEGI PANJANG");
       
        System.out.println("panjang =");
        panjang = userInput.nextInt();
        
        System.out.println("lebar =");
        lebar = userInput.nextInt();
         
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
        
        System.out.println("RUMUS VOLUME BALOK");
        
        System.out.println("Tinggi");
        tinggi = userInput.nextInt();
        
        volume = luas * tinggi ;
        System.out.println("Volume Balok = " + volume);
        
        
        
        
        
        /*int a = 2;
        int b = 5;
        int c = a * b ;
        System.out.println(c);
           */
    }
    
}
