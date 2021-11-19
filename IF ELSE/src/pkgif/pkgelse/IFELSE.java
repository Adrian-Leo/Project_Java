/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkgelse;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class IFELSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
               
         int matematika , ipa ,inggris,average;
         
        
         System.out.println("nilai matematika =");
         matematika = input.nextInt();
         System.out.println("nilai ipa =");
         ipa = input.nextInt();
         System.out.println("nilai inggris =");
         inggris = input.nextInt();
         
         if (matematika >=65 && ipa>=65 && inggris>=65){
             average = (int) ((double) ( matematika + ipa + inggris)/3);
             if (average >= 55){
                 System.out.println("lulus");
             }
             else {
                 System.out.println("tidak lulus");
             }
        }
         else {
             System.out.println("tidak lulus");
         }
}
}
