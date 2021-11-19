/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class array2 {
    public static void main(String[] args) {
        double grades[] = {87.2,89.5,68.2,78.5,97.2,81.0};
        int numbers[] = new int[10];
        int i;
        
        double max,min;
        min = grades[0];
        max = grades[0];
        for (i= 0; i <= 5 ; i++){
            if(grades[i] > max) {
                max =grades[i];
            }   
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        System.out.println("the biggest grade is : " + max);
        System.out.println("the smallest grade is : " + min);
        
        for (int j = 0; j < 10; j++) {
            numbers[j] = j + 10 ;
            System.out.println("for numbers " + j + " the value is : " + numbers[j]);
        }
    }
}
