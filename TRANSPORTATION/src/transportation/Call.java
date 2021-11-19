/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

/**
 *
 * @author lenovo
 */
public class Call {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Public pc = new Public();
        pc.alert();
        System.out.println(pc.feature_one);
        System.out.println(pc.feature_two);
        System.out.println(pc.feature_three);
        
        pc.sea();
        pc.land();
        pc.air();
    }
    
}
