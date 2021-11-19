/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
// THIS IS ENCHANCED FOR LOOP 
public class array5 {
    public static void main(String[] args) {
        int grade[]= {12,43,2,7,33,65,4,1,4,98};
        int max = grade[0];
        int min =grade[0];
        for (int value : grade) {
            if(value > max ){
                max = value;
            }
            if(value < min){
                min = value;
            }
        }
        System.out.println("the maximum value is " + max);
        System.out.println("the minimum value is " + min);
    }
}
