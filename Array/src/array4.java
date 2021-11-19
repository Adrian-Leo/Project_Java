/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class array4 {
    public static void main(String[] args) {
        int revenue [][] = new int [12][2];
        
        revenue [0][0] =1;
        revenue [1][0] =2;
        revenue [2][0] =3;
        revenue [3][0] =4;
        revenue [4][0] =5;
        revenue [5][0] =6;
        revenue [6][0] =7;
        revenue [7][0] =8;
        revenue [8][0] =9;
        revenue [9][0] =10;
        revenue [10][0] =11;
        revenue [11][0] =12;
        
        revenue [0][1] =32;
        revenue [1][1] =26;
        revenue [2][1] =38;
        revenue [3][1] =41;
        revenue [4][1] =55;
        revenue [5][1] =68;
        revenue [6][1] =71;
        revenue [7][1] =85;
        revenue [8][1] =92;
        revenue [9][1] =101;
        revenue [10][1] =114;
        revenue [11][1] =121;
        
              
        
        for (int i = 0; i <= 11; i++) {
            System.out.println("for month number " + revenue[i][0] + " the revenue is " + revenue[i][1] );
        }
        
    }
}
