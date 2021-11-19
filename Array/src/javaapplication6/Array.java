/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author lenovo
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    private static void array() {
        // TODO  
        System.out.println("\n MEMANGGIL ARRAY \n");
        double [] arrA = new double [10];
        double [] arrB = new double [10];
        
        int [] arrInt1 = new int [] {1,2,3,4,5,6};
        int [] arrInt2 = new int [6];
            arrInt2[0] = 1;
            arrInt2[1] = 2;
            arrInt2[2] = 3;
            arrInt2[3] = 4;
            arrInt2[4] = 5;
            arrInt2[5] = 6;
           
            System.out.println(arrInt2[0]);
            System.out.println(arrInt2[1]);
            System.out.println(arrInt2[2]);
            System.out.println(arrInt2[3]);
            System.out.println(arrInt2[4]);
            System.out.println(arrInt2[5]);
   }
    private static void loopingarray() {
        System.out.println("\n ARRAY MENGGUNAKAN LOOPING \n");
        int [] arrInt = new int [10];
            for (int x = 0 ; x < arrInt.length ; x++){
                arrInt[x] = x + 1;
                System.out.println(arrInt[x]); 
            }
//         for (int x = 0 ; x < arrInt.length ; x++){
//             System.out.println(arrInt[x]);      
//    }
   
    }
    
    private static void mahasiswa(){

        System.out.println("\n ARRAY 2 DIMENSI \n");
        String [][] mahasiswa = {
            {"leo","3SC5"},
            {"gifino","3SC6"},
            {"firzan","3SC7"},
        };
        System.out.println(mahasiswa[0][0]);
        
        for (int x = 0; x < mahasiswa.length; x++) {
            System.out.println("Nama :" + mahasiswa [x][0]);
             System.out.println("Kelas :" + mahasiswa [x][1]);
        }

    }
//        private static void indexoutofbounds () {
//        int [] arrA = new int [] {1,2,3,4};
//            System.out.println(arrA[0]);
//            System.out.println(arrA[1]);
//            System.out.println(arrA[2]);
//            System.out.println(arrA[3]);
//}
     

             
            
           
        public static void main(String[] args){
            array();
            loopingarray();
            mahasiswa();
         
                     
            
    }
}

  
    
    
     