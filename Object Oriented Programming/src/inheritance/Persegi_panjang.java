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
public class Persegi_panjang extends Bangun_datar{
    float panjang,lebar;
    
    @Override
    float luas(){
    float luas = panjang * lebar;
        System.out.println("luas persegi panjang " + luas);
    return luas;
    }
    
    @Override 
    float keliling(){
    float keliling = 2 * (panjang + lebar);
        System.out.println("keliling persegi panjang " + keliling);
    return keliling; 
    }
}
