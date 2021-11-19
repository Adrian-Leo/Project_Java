/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwise;

/**
 *
 * @author lenovo
 */
public class java {
    public static void main(String[] args) {
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
       
        
    }
    
}
