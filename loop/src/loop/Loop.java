/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author lenovo
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    private static void ez1() {
        int loop=10;
        for (int x = 1 ; x < loop ; x++){
            
            System.out.println(x); 
        }
//       String word = "SISTEM INFORMASI";
//        
//       for (int i = 0; i <= word.length(); i++){
//            System.out.println(word.charAt(12));
//        }
    }
    private static void ez2() {
        int i = 1;
        String word = "SISTEM INFORMASI";
        while ( i <= 10)
        {
            System.out.println(word.charAt(12));
            i++;
        }
        System.out.println("\n");
    }
    
//    private static void ez3() {
//        String kata = "SISTEM INFORMASI";
//        String repeated = kata.repeated(3);
//        System.out.println(kata);
//    }
    public static void main(String[] args) {
        System.out.println("LOOP FOR");
        ez1();
        System.out.println("LOOP WHILE");
        ez2();
    }
    
    
}
