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
public class calling {
    public static void main(String[] args) {
    Bangun_datar bgnDatar = new Bangun_datar();
    persegi psg = new persegi();
    Persegi_panjang psg_panjang = new Persegi_panjang();
    
    psg.sisi = 3;
    
    psg_panjang.panjang =6;
    psg_panjang.lebar=5;
   
    bgnDatar.luas();
    bgnDatar.keliling();
    
    psg.luas();
    psg.keliling();
    
    psg_panjang.luas();
    psg_panjang.keliling();
   
    }
}
