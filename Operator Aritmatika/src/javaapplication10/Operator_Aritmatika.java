/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author lenovo
 */
public class Operator_Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("\n OPERASI ARITMATIKA \n");
       float x = 8;
       int y = 10;
       float hasil;
        System.out.println("ini angka = " + x);
        
        //PENJUMLAHAN
        hasil = x + y ;
        System.out.println(x + "+" + y + "=" + hasil );
        System.out.printf("%f + %d = %f\n",x,y,hasil);
        //pengurangan
        hasil = x - y ;
        System.out.printf("%f - %d = %f \n",x,y,hasil);
        //perkalian
        hasil = x * y;
        System.out.printf("%f X %d = %f \n",x,y,hasil);
        //pembagian
        hasil = x / y ;
        System.out.printf ("%f : %d = %f \n",x,y,hasil);
      // modulus
        hasil = x % y;
        System.out.printf("%f %% %d = %f \n",x,y,hasil);
   
        int nilaiInt = 320 ;
        
        System.out.println("nilai Int = " + nilaiInt);
        System.out.println("nilai max int = " + Integer.MAX_VALUE );
        
        long nilaiLong = nilaiInt;
        System.out.println("nilai Long = " + nilaiLong);
        System.out.println("nilai max Long = " + Long.MAX_VALUE );
        
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai Byte =" + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
         System.out.println("nilai max byte = " + Byte.MIN_VALUE);
        
        int angka = 1;
        System.out.println("nilai angka = "+ -angka);
        
        int angka2 =10;
           angka2++;
           System.out.println("hasil = " + angka2);
           
           
           int angka3 = 15;
           System.out.printf("nilai prefix = %d \n",++angka3);
           
           int angka4 = 20;
           System.out.printf("nilai postfix = %d \n" , angka4++);
           System.out.printf("hasil postfix = %d \n", angka4);
           
           int p =10;
           p += 20;
           System.out.println("hasil p = " + p);
           
           int q = 15;
           q -= 5;
           System.out.printf("hasil q = %d \n",q);
           
           int r = 50;
           r *= 10;
           System.out.println("hasil r = " + r);
         
         System.out.println("\n OPERASI BITWISE \n");
         
          byte a = 45;
        byte b;
        String a_bits, b_bits;
        
        a_bits = String.format("%8s",Integer.toBinaryString(a));
        System.out.println("BINER");
        System.out.printf("%s = %d\n",a_bits,a);
        
         a_bits = String.format("%8s",Integer.toOctalString(a));
        System.out.println("OCTAL");
        System.out.printf("%s = %d\n",a_bits,a);
        
         a_bits = String.format("%8s",Integer.toHexString(a));
        System.out.println("HEXA");
        System.out.printf("%s = %d\n",a_bits,a);
        
        System.out.println("SHIFT LEFT");
        b = (byte)(a << 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b));
        System.out.printf("%s = %d\n",b_bits,b);
         
         
         System.out.println("\n OPERASI KOMPARASI \n");
        
         
      
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
