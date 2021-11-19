/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author lenovo
 */
public class carstore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        car mobil = new car ();
        mobil.setBrand("Toyota Avanza");
        mobil.setIndirect_injection("multi-point injection");
        mobil.setFuel("pertamax");
        mobil.setDoor(4);
        mobil.setTransmission("automatic");
    
        System.out.println(mobil.getBrand());
        System.out.println(mobil.getIndirect_injection());
        System.out.println(mobil.getFuel());
        System.out.println(mobil.getTransmission());
        System.out.println(mobil.getDoor());
        mobil.setBrand(mobil.getBrand());
    }
    
}
