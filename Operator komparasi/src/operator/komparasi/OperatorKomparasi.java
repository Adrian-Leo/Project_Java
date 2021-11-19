/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.komparasi;

/**
 *
 * @author lenovo
 */
public class OperatorKomparasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        boolean hasilKomparasi;
        System.out.println("======PERSAMAAN=======");
        a=10;
        b=15;
        
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ==> %s \n",a,b,hasilKomparasi);
        
        a=10;
        b=10;
        
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ==> %s \n",a,b,hasilKomparasi);
        
         a=10;
        b=15;
        System.out.println("======PERTIDAKSAMAAN======");
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ==> %s \n",a,b,hasilKomparasi);
        
        a=10;
        b=10;
        
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ==> %s \n",a,b,hasilKomparasi);
        
    }
    
}
