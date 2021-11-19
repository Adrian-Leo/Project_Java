/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author lenovo
 */
public class persegi extends Bangun_datar {
    float sisi;
    
    @Override
    float luas(){
    float luas = sisi * sisi;
        System.out.println("luas persegi " + luas);
        return luas;
    }
    
    @Override 
    float keliling(){
    float keliling = 6 * sisi;
        System.out.println("keliling persegi  " + keliling );
        return keliling;
    }
    
}
